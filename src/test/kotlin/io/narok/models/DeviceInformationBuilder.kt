package io.narok.models

class DeviceInformationBuilder {

    private val domain = ""
    private val path = ""
    private val parameters = mapOf<String, List<String>>()
    private val isHttps = false
    private var userAgent = ""
    private val whiteListedCookies = mapOf<String, String>()
    private var ipAddress: String? = null
    private val sessionId = ""
    private val deviceSignature: DeviceSignature? = null
    private val deviceType: DeviceType? = null

    fun withUserAgent(userAgent: String): DeviceInformationBuilder {
        this.userAgent = userAgent
        return this
    }

    fun withIpAddress(ipAddress: String): DeviceInformationBuilder {
        this.ipAddress = ipAddress
        return this
    }

    fun build(): DeviceInformation {
        return DeviceInformation(
            domain,
            path,
            parameters,
            isHttps,
            userAgent,
            whiteListedCookies,
            ipAddress,
            sessionId,
            deviceSignature,
            deviceType
        )
    }
}