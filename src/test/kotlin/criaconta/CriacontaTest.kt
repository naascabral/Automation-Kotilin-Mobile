package criaconta

import core.Hooks
import io.qameta.allure.Step
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder


@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class CriacontaTest: Hooks(){

    val criarcontaAction = CriarcontaAction()

    @Test
    @Step("Realizando o cadastro de usuario")
    @Order(1)
    fun testeCadastrarUsuario() {
        criarcontaAction.realizarcadastro()
        criarcontaAction.validarCadastro()
    }

}