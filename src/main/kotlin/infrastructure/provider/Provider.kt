/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.provider

import application.controller.manager.PatientDatabaseManager

/**
 * It's responsible to provide the [patientDatabaseManager]
 * to Patient Controller.
 */
interface Provider {

    /** The manager of user operations inside database. */
    val patientDatabaseManager: PatientDatabaseManager
}
