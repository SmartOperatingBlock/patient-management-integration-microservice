/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package application.presenter.api.model

import entity.Patient
import entity.PatientData
import entity.PatientData.BloodGroup
import kotlinx.serialization.Serializable

/** Object to serialize and deserialize the Patient model in API.
 *  It deserializes [taxCode], [name], [surname], [birthdate], [height], [weight] and [bloodGroup].
 */
@Serializable
data class PatientApiDto(

    val taxCode: String,

    val name: String,

    val surname: String,

    val height: Double,

    val weight: Double,

    val birthdate: String,

    val bloodGroup: BloodGroup
)

/** Extension method to convert a [Patient] into its [PatientApiDto]. */
fun Patient.toPatientApiDto(): PatientApiDto = PatientApiDto(
    taxCode = this.taxCode.code,
    name = this.name,
    surname = this.surname,
    birthdate = this.birthdate,
    height = this.height.value,
    weight = this.weight.value,
    bloodGroup = this.bloodGroup
)

/** Extension method to convert a [PatientApiDto] into a [Patient]. */
fun PatientApiDto.toPatient(): Patient = Patient(
    taxCode = PatientData.TaxCode(this.taxCode),
    name = this.name,
    surname = this.surname,
    birthdate = this.birthdate,
    height = PatientData.Height(this.height, PatientData.LengthUnit.CENTIMETER),
    weight = PatientData.Weight(this.weight, PatientData.MassUnit.KILOGRAM),
    bloodGroup = this.bloodGroup
)
