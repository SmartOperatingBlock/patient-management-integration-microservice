/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.controller.manager

import entity.Patient
import entity.PatientData.TaxCode

/** The interface for Database operations on [Patient]. */
interface PatientDatabaseManager {

    /** Insert the [patient] into the database. */
    fun insertPatient(patient: Patient): Boolean

    /** Delete the [Patient] from the database given its [taxCode]. */
    fun deletePatient(taxCode: TaxCode): Boolean

    /** Get the [Patient] from the database given its [taxCode]. */
    fun getPatient(taxCode: TaxCode): Patient?
}
