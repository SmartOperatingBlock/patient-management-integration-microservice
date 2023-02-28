/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entity

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe

/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

class TestEntity : StringSpec({

    val patient = Patient(
        PatientData.TaxCode("1234567890"),
        "John",
        "Doe",
        "1990-05-10",
        PatientData.Height(180.5, PatientData.LengthUnit.CENTIMETER),
        PatientData.Weight(75.2, PatientData.MassUnit.KILOGRAM),
        PatientData.BloodGroup.A_POSITIVE
    )

    "A patient should correctly be created" {
        patient shouldNotBe null
    }

    "A patient with empty taxCode should throw exception" {
        shouldThrow<IllegalStateException> {
            Patient(
                PatientData.TaxCode(""),
                "John",
                "Doe",
                "1990-05-10",
                PatientData.Height(180.5, PatientData.LengthUnit.CENTIMETER),
                PatientData.Weight(75.2, PatientData.MassUnit.KILOGRAM),
                PatientData.BloodGroup.A_POSITIVE
            )
        }
    }
})
