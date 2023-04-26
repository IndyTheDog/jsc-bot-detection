package io.narok.plugins

import io.ktor.server.application.*
import io.narok.repo.fiftyOneDegreesDIModule
import io.narok.services.DeviceSignatureService
import io.narok.services.DeviceTypeService
import io.narok.services.IDeviceSignatureService
import io.narok.services.IDeviceTypeService
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.ktor.di
import org.kodein.di.singleton

val mainDI = DI {
    bind<IDeviceSignatureService> { singleton { DeviceSignatureService() } }
    bind<IDeviceTypeService> { singleton { DeviceTypeService(di) } }
    import(fiftyOneDegreesDIModule)
}

fun Application.configureDI() {

    di {
        extend(mainDI)
    }
}