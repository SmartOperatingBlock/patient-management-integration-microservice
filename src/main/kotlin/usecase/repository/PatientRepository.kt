/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package usecase.repository

import entity.Patient
import entity.PatientData.TaxCode

/** The repository for [Patient] operations. */
interface PatientRepository {

    /** Create the given [patient]. */
    fun createPatient(patient: Patient): Boolean

    /** Create a [Patient] given its [taxCode]. */
    fun deletePatient(taxCode: TaxCode): Boolean

    /** Return a [Patient] given its [taxCode]. */
    fun getPatient(taxCode: TaxCode): Patient?
}
