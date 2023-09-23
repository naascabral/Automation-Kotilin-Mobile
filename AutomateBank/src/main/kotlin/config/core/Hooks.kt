package core

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.jupiter.api.*


open class Hooks {
    private var driver: AppiumDriver<MobileElement>? = null


    @BeforeEach
    fun iniciar() {
        driver = Capabilities.inicializarAppiumDriver()
    }

    @AfterEach
    fun finalizar() {
        Capabilities.finalizarAppiumDrivery()
    }

}