/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package infrastructure.database

import de.flapdoodle.embed.mongo.config.Net
import de.flapdoodle.embed.mongo.distribution.Version
import de.flapdoodle.embed.mongo.transitions.Mongod
import de.flapdoodle.os.CommonOS
import de.flapdoodle.os.ImmutablePlatform
import de.flapdoodle.os.Platform
import de.flapdoodle.os.linux.LinuxDistribution
import de.flapdoodle.os.linux.UbuntuVersion
import de.flapdoodle.reverse.StateID
import de.flapdoodle.reverse.transitions.Start
import de.flapdoodle.net.Net as Network

private inline fun <reified T : Any> T.toTransition() = Start.to(StateID.of(T::class.java)).initializedWith(this)

/** Starts a mongod process on localhost of the running machine. */
internal fun withMongo(operation: () -> Unit) {
    if (System.getProperty("os.name").lowercase().contains("win")) {
        println("Testing with MongoDB is disabled on Windows due to flaky behavior")
    } else {
        runCatching { Platform.detect(CommonOS.list()) }
            .onFailure { println("Failed to detect platform") }
            .onSuccess { detectedPlatform ->
                val platform: Platform = detectedPlatform
                    .takeUnless { it.operatingSystem() == CommonOS.Linux && it.distribution().isEmpty }
                    ?: ImmutablePlatform.builder()
                        .from(detectedPlatform)
                        .distribution(LinuxDistribution.Ubuntu)
                        .version(UbuntuVersion.Ubuntu_20_10)
                        .build()
                val mongod = Mongod.instance()
                    .withNet(Net.of("localhost", 27017, Network.localhostIsIPv6()).toTransition())
                    .withPlatform(platform.toTransition())
                val runningState = mongod.start(Version.Main.V6_0)
                try {
                    operation()
                } finally {
                    runningState.current().stop()
                }
            }
    }
}
