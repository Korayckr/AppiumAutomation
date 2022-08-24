package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.MainPage;

public class MainPageTest extends BaseTest {
    MainPage mainPage = new MainPage(driver);

    @Step("User Clicks Tum Islemler Tab")
    public void clickTumIslemler() { mainPage.clickTumIslemlerTab(); }


}
