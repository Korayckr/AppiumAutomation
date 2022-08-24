package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.OnayPage;


public class OnayPageTest extends BaseTest {
    OnayPage onayPage = new OnayPage(driver);

    @Step("Onayla butonuna tıklanır.")
    public void clickOn() {onayPage.clickOnBtn();
    }
}
