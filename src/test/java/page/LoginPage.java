package page;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import static constant.Utilities.*;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

        public void clickButton()   {clickElement(AKT_GRS);}

        public void fillPassword() {
            sendKeys(LOGIN_TEXT,"515007556976");
        }

        public void clickDevam()    {clickElement(DEVAM_BTN);}

}
