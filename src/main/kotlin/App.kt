import infrastructure.api.ApiRouter
import infrastructure.provider.Provider
import infrastructure.provider.ProviderImpl

/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

/**
 * The Application launcher.
 */
fun main() {
    val provider: Provider = ProviderImpl()
    ApiRouter(provider.patientDatabaseManager).start()
}
