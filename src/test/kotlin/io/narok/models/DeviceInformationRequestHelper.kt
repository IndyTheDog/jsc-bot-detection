package io.narok.models

fun defaultDeviceInformationRequest(): DeviceInformationRequest {
    return DeviceInformationRequestBuilder("http://localhost", "User-Agent 123", "192.168.1.1").build()
}

fun noIpAddressDeviceInformationRequest(): DeviceInformationRequest {
    return DeviceInformationRequestBuilder("http://localhost", "User-Agent 123", "").build()
}

fun noUserAgentDeviceInformationRequest(): DeviceInformationRequest {
    return DeviceInformationRequestBuilder("http://localhost", "", "192.168.1.1").build()
}
