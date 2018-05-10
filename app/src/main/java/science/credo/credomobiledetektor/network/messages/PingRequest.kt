package science.credo.credomobiledetektor.network.messages

import science.credo.credomobiledetektor.info.IdentityInfo

/**
 * Ping the server.
 *
 * @property delta_time Time since last detection / ping / startup.
 * @property timestamp UNIX timestamp of ping time.
 */
class PingRequest(
    val delta_time: Int,
    val timestamp: Int,
    deviceInfo: IdentityInfo.IdentityData
) : BaseRequest (deviceInfo)