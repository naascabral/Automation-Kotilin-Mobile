package criaconta

import core.BasePage
import core.Capabilities
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy


class CriaconntaScreen : BasePage() {

    @AndroidFindBy(id = "com.exnova:id/phoneEmailToggle")
    lateinit var _btnemail: MobileElement

    @AndroidFindBy(id = "com.exnova:id/emailEdit")
    lateinit var _txtnemail: MobileElement

    @AndroidFindBy(id = "com.exnova:id/passwordEdit")
    lateinit var _txtpassword: MobileElement

    @AndroidFindBy(id = "com.exnova:id/welcomePolicyCheck")
    lateinit var _btnacept: MobileElement

    @AndroidFindBy(id = "com.exnova:id/button")
    lateinit var _btnregister: MobileElement

    @AndroidFindBy(id = "com.exnova:id/closeBtn")
    lateinit var _btnclose: MobileElement

    @AndroidFindBy(id = "com.exnova:id/hintActionButton")
    lateinit var _btngo: MobileElement

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
    lateinit var _btnmenu: MobileElement

    @AndroidFindBy(id = "com.exnova:id/userStatus")
    lateinit var _btncadastro: MobileElement

    @AndroidFindBy(id = "com.exnova:id/emailDesc")
    lateinit var _lblemail: MobileElement



}
