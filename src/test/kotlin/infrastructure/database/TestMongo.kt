/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.database

import entity.Patient
import entity.PatientData
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class TestMongo : StringSpec({

    val mockPatient = Patient(
        PatientData.TaxCode("1234567890"),
        "John",
        "Doe",
        "1990-05-10",
        PatientData.Height(180.5, PatientData.LengthUnit.CENTIMETER),
        PatientData.Weight(75.2, PatientData.MassUnit.KILOGRAM),
        PatientData.BloodGroup.A_POSITIVE
    )

    "Test patient creation on mongo db" {
        withMongo {
            val mongoClient = MongoClient("mongodb://localhost:27017").also {
                it.getDatabase(MongoClient.databaseName).drop()
            }
            mongoClient.insertPatient(mockPatient) shouldBe true
        }
    }

    "Test patient deletion on mongo db" {
        withMongo {
            val mongoClient = MongoClient("mongodb://localhost:27017").also {
                it.getDatabase(MongoClient.databaseName).drop()
            }
            mongoClient.insertPatient(mockPatient)
            mongoClient.deletePatient(mockPatient.taxCode) shouldBe true
        }
    }

    "Test patient retrieve on mongo db" {
        withMongo {
            val mongoClient = MongoClient("mongodb://localhost:27017").also {
                it.getDatabase(MongoClient.databaseName).drop()
            }
            mongoClient.insertPatient(mockPatient)
            mongoClient.getPatient(mockPatient.taxCode).also {
                it shouldNotBe null
                it?.taxCode shouldBe mockPatient.taxCode
            }
        }
    }
})
