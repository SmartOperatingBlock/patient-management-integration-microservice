/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entity

import entity.PatientData.BloodGroup
import entity.PatientData.Height
import entity.PatientData.TaxCode
import entity.PatientData.Weight

/**
 * The patient model.
 */
data class Patient(

    /** The [taxCode] of the patient. */
    val taxCode: TaxCode,

    /** The [name] of the patient. */
    val name: String,

    /** The [surname] of the patient. */
    val surname: String,

    /** The [birthdate] of the patient. */
    val birthdate: String,

    /** The [Height] of the patient. */
    val height: Height,

    /** The [Weight] of the patient. */
    val weight: Weight,

    /** The [BloodGroup] of the patient. */
    val bloodGroup: BloodGroup
) {
    init {
        check(taxCode.code.isNotEmpty()) {
            "Invalid Patient: provide a valid TaxCode!"
        }
    }

    override fun equals(other: Any?): Boolean = when {
        other === this -> true
        other is Patient -> this.taxCode == other.taxCode
        else -> false
    }

    override fun hashCode(): Int = taxCode.hashCode()
}
