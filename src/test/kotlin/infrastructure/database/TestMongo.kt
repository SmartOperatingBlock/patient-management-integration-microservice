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

    "Test patient operations on mongo db" {
        withMongo {
            val mockPatient = Patient(
                PatientData.TaxCode("1234567890"),
                "John",
                "Doe",
                "1990-05-10",
                PatientData.Height(180.5, PatientData.LengthUnit.CENTIMETER),
                PatientData.Weight(75.2, PatientData.MassUnit.KILOGRAM),
                PatientData.BloodGroup.A_POSITIVE
            )

            val mongoClient = MongoClient("mongodb://localhost:27017")

            mongoClient.insertPatient(mockPatient) shouldBe true

            mongoClient.deletePatient(mockPatient.taxCode) shouldBe true

            mongoClient.insertPatient(mockPatient)
            mongoClient.getPatient(mockPatient.taxCode).also {
                it shouldNotBe null
                it?.taxCode shouldBe mockPatient.taxCode
            }
        }
    }
})
