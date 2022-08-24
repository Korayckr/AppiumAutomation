package page;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.*;

public class TumIslemlerMenu extends BasePage {

    public TumIslemlerMenu(AndroidDriver driver) {super(driver);}

    public void clickYatırımTab()   {
        clickElement(YATIRIM_MENU);
    }

}
