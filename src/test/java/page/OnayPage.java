package page;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.*;

public class OnayPage extends BasePage {
    public OnayPage(AndroidDriver driver) {super(driver);}

    public void clickOnBtn()  {
        clickElement(ONAY_BTN);
    }
}
