/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.service

import entity.Patient
import entity.PatientData.TaxCode
import usecase.repository.PatientRepository

/** The module with all the [Patient] [ApplicationService]. */
object PatientServices {

    /** Application service to create a [patient] using a [patientRepository]. */
    class CreatePatient(
        private val patient: Patient,
        private val patientRepository: PatientRepository
    ) : ApplicationService<Boolean> {

        override fun execute(): Boolean =
            if (patientRepository.getPatient(patient.taxCode) == null) {
                patientRepository.createPatient(patient)
            } else false
    }

    /** Application service to delete a [Patient] given the [taxCode] using a [patientRepository]. */
    class DeletePatient(
        private val taxCode: TaxCode,
        private val patientRepository: PatientRepository
    ) : ApplicationService<Boolean> {

        override fun execute(): Boolean =
            patientRepository.deletePatient(taxCode)
    }

    /** Application service to det a [Patient] given the [taxCode] using a [patientRepository]. */
    class GetPatient(
        private val taxCode: TaxCode,
        private val patientRepository: PatientRepository
    ) : ApplicationService<Patient?> {

        override fun execute(): Patient? =
            patientRepository.getPatient(taxCode)
    }
}
