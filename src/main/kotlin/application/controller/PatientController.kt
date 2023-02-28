/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.controller

import application.controller.manager.PatientDatabaseManager
import entity.Patient
import entity.PatientData.TaxCode
import usecase.repository.PatientRepository

/**
 * The controller of [Patient] operations.
 * It contains the logic to access and update patients data.
 */
class PatientController(
    private val dbManager: PatientDatabaseManager
) : PatientRepository {

    override fun createPatient(patient: Patient): Boolean = dbManager.insertPatient(patient)

    override fun deletePatient(taxCode: TaxCode): Boolean = dbManager.deletePatient(taxCode)

    override fun getPatient(taxCode: TaxCode): Patient? = dbManager.getPatient(taxCode)
}
