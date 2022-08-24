package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.LoginPage;

public class LoginPageTest  extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);

    @Step("Aktivasyonsuz giris butonuna tıklanır.")
    public void clickBtn(){loginPage.clickButton();}

    @Step("Kullanıcı no girilir")
    public void fillPasswordField() {
        loginPage.fillPassword();
    }

    @Step("Devam butonu tıklandı.")
    public void clickDevamBtn() {loginPage.clickDevam();}
}
