package page;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.ONAY_IKON;

public class OnayKontrol extends BasePage {

    public OnayKontrol(AndroidDriver driver) {super(driver);}

    public boolean isDisplayedControl() {
        return isVisible(ONAY_IKON);
    }
}
