/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.service.mock

import application.controller.manager.PatientDatabaseManager
import entity.Patient
import entity.PatientData

class MockDbManager : PatientDatabaseManager {

    private val patients = mutableSetOf<Patient>()

    override fun insertPatient(patient: Patient): Boolean {
        patients.add(patient)
        return getPatient(patient.taxCode) != null
    }

    override fun deletePatient(taxCode: PatientData.TaxCode): Boolean =
        patients.removeIf { it.taxCode == taxCode }

    override fun getPatient(taxCode: PatientData.TaxCode): Patient? =
        patients.find { it.taxCode == taxCode }
}
