package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.YatirimMenu;

public class YatirimMenuTest extends BaseTest {

    YatirimMenu yatirimMenu = new YatirimMenu(driver);

    @Step("user clicks Para Yatirma")
    public void clickParaYatır() { yatirimMenu.clickParaYatirTab();}
}
