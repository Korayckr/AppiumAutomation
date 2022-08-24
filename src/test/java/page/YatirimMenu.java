package page;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import static constant.Utilities.*;

public class YatirimMenu extends BasePage {

    public YatirimMenu(AndroidDriver driver) {super(driver);}

    public void clickParaYatirTab()    {
        scrollToBottom(PARA_YATIRMA);
        clickElement(PARA_YATIRMA );
    }



}
