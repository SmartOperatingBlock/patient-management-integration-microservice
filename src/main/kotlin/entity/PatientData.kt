/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entity

import kotlinx.serialization.Serializable

/**
 * Module with all data for the [Patient] entity.
 */
object PatientData {

    /** The identifier of the patient given its [code]. */
    @Serializable
    data class TaxCode(val code: String) {

        override fun equals(other: Any?): Boolean = when {
            other === this -> true
            other is TaxCode -> this.code == other.code
            else -> false
        }

        override fun hashCode(): Int = this.code.hashCode()
    }

    /** The [value] of [Height] of the patient given its measure [unit]. */
    @Serializable
    data class Height(val value: Double, val unit: LengthUnit)

    /** The [value] of [Weight] of the patient given its measure [unit]. */
    @Serializable
    data class Weight(val value: Double, val unit: MassUnit)

    /** The length measure unit. */
    @Serializable
    enum class LengthUnit {
        CENTIMETER, METER
    }

    /** The mass measure unit. */
    @Serializable
    enum class MassUnit {
        KILOGRAM, GRAM
    }

    /** The blood groups enum. */
    @Serializable
    enum class BloodGroup {
        A_NEGATIVE,
        A_POSITIVE,
        B_NEGATIVE,
        B_POSITIVE,
        ZERO_NEGATIVE,
        ZERO_POSITIVE,
        AB_NEGATIVE,
        AB_POSITIVE,
    }

    /** The gender enum. */
    @Serializable
    enum class Gender {
        MALE, FEMALE
    }
}
