/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.api.routes

import application.controller.PatientController
import application.controller.manager.PatientDatabaseManager
import application.presenter.api.model.PatientApiDto
import application.presenter.api.model.toPatient
import application.presenter.api.model.toPatientApiDto
import application.service.PatientServices.CreatePatient
import application.service.PatientServices.DeletePatient
import application.service.PatientServices.GetPatient
import entity.Patient
import entity.PatientData.TaxCode
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.delete
import io.ktor.server.routing.get
import io.ktor.server.routing.post

/** The [Patient] API implementation. */
fun Route.patientAPI(patientDatabaseManager: PatientDatabaseManager) {

    get("/api/patients/{taxCode}") {
        GetPatient(
            TaxCode(call.parameters["taxCode"].orEmpty()),
            PatientController(patientDatabaseManager)
        ).execute().apply {
            if (this != null)
                call.respond(HttpStatusCode.OK, this.toPatientApiDto())
            else
                call.respond(HttpStatusCode.NotFound)
        }
    }

    delete("/api/patients/{taxCode}") {
        DeletePatient(
            TaxCode(call.parameters["taxCode"].orEmpty()),
            PatientController(patientDatabaseManager)
        ).execute().let { result ->
            if (result)
                call.respond(HttpStatusCode.NoContent)
            else
                call.respond(HttpStatusCode.NoContent)
        }
    }

    post("api/patients") {
        val patient: Patient = call.receive<PatientApiDto>().toPatient()
        CreatePatient(
            patient,
            PatientController(patientDatabaseManager)
        ).execute().let { result ->
            if (result)
                call.respond(HttpStatusCode.Created)
            else
                call.respond(HttpStatusCode.Conflict)
        }
    }
}
