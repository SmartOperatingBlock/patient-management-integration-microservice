/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.database

import application.controller.manager.PatientDatabaseManager
import com.mongodb.client.MongoDatabase
import entity.Patient
import entity.PatientData
import org.litote.kmongo.KMongo
import org.litote.kmongo.eq
import org.litote.kmongo.findOne
import org.litote.kmongo.getCollection

/**
* The Mongo client.
*/
class MongoClient(
    connectionString: String
) : PatientDatabaseManager {

    init {
        check(connectionString.isNotEmpty()) {
            "Please provide the User Management MongoDB connection string!"
        }
    }

    private val client = KMongo.createClient(connectionString)

    private val patientsCollection =
        client.getDatabase(databaseName).getCollection<Patient>("patients")

    /** Return a database given its [databaseName]. */
    fun getDatabase(databaseName: String): MongoDatabase = client.getDatabase(databaseName)

    override fun insertPatient(patient: Patient): Boolean =
        patientsCollection.insertOne(patient).run {
            getPatient(patient.taxCode) != null
        }

    override fun deletePatient(taxCode: PatientData.TaxCode): Boolean =
        patientsCollection.deleteOne(Patient::taxCode eq taxCode).deletedCount > 0

    override fun getPatient(taxCode: PatientData.TaxCode): Patient? =
        patientsCollection.findOne(Patient::taxCode eq taxCode)

    companion object {
        /** The name of the database. */
        const val databaseName = "patient_management"
    }
}
