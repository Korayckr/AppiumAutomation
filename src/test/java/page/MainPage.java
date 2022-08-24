package page;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.*;

public class MainPage extends BasePage {

    public MainPage(AndroidDriver driver) {
        super(driver);
    }

    public void clickTumIslemlerTab()   {
        clickElement(TUM_ISLEMLER);
    }
}
