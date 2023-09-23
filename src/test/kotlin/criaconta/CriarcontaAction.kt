package criaconta

import com.github.javafaker.Faker
import core.BasePage
import org.junit.Assert


class CriarcontaAction : BasePage() {

    var faker = Faker()
    val criaconntaScreen = CriaconntaScreen()

    lateinit var email: String


    fun realizarcadastro() {
        email = faker.internet().emailAddress()
        click(criaconntaScreen._btnemail)
        click(criaconntaScreen._txtnemail)
        sendKeys(criaconntaScreen._txtnemail, email)
        click(criaconntaScreen._txtpassword)
        sendKeys(criaconntaScreen._txtpassword, "12345678")
        driver?.hideKeyboard()
        click(criaconntaScreen._btnacept)
        click(criaconntaScreen._btnregister)
    }

    fun validarCadastro() {
        var btnclose: Boolean = false

        while (btnclose == false) {
            btnclose = iselementpresent(criaconntaScreen._btnclose)
            if (btnclose != false) {
                click(criaconntaScreen._btnclose)
                iselementpresent(criaconntaScreen._btngo)
                click(criaconntaScreen._btngo)
                iselementpresent(criaconntaScreen._btnmenu)
                click(criaconntaScreen._btnmenu)
            }
        }
        iselementpresent(criaconntaScreen._btncadastro)
        click(criaconntaScreen._btncadastro)

        var emailcadastrado = gettext(criaconntaScreen._lblemail)
        if (emailcadastrado == email) {
            print("Cadastro efetuado com sucesso")
        } else {
            print("email não cadastrado")
        }
    }


}