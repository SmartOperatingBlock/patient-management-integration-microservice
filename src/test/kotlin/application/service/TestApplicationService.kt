/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.service

import application.controller.PatientController
import application.service.mock.MockDbManager
import entity.Patient
import entity.PatientData
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class TestApplicationService : StringSpec({

    var patientController = PatientController(MockDbManager())
    val mockPatient = Patient(
        PatientData.TaxCode("1234567890"),
        "John",
        "Doe",
        "1990-05-10",
        PatientData.Height(180.5, PatientData.LengthUnit.CENTIMETER),
        PatientData.Weight(75.2, PatientData.MassUnit.KILOGRAM),
        PatientData.BloodGroup.A_POSITIVE,
    )

    beforeEach {
        patientController = PatientController(MockDbManager())
    }

    "The application service should be able to create a Patient" {
        patientController.createPatient(mockPatient) shouldBe true
    }

    "The application service should be able to get a Patient" {
        patientController.createPatient(mockPatient)
        patientController.getPatient(mockPatient.taxCode).let {
            it shouldNotBe null
            it?.taxCode shouldBe mockPatient.taxCode
        }
    }

    "The application service should be able to delete a Patient" {
        patientController.createPatient(mockPatient)
        patientController.deletePatient(mockPatient.taxCode) shouldBe true
    }
})
