package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.TumIslemlerMenu;

public class TumIslemlerMenuTest extends BaseTest {
    TumIslemlerMenu tumIslemlerMenu = new TumIslemlerMenu(driver);

    @Step("user clicks Yatirim menu")
    public void clickYatırım()  {tumIslemlerMenu.clickYatırımTab();}
}
