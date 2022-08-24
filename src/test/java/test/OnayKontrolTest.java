package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import page.OnayKontrol;

public class OnayKontrolTest extends BaseTest {
    OnayKontrol onayKontrol = new OnayKontrol(driver);

    @Step("Onaylandı mı kontrol eder.")
    public void checkIsVisible() {
        Assert.assertEquals(onayKontrol.isDisplayedControl(),true);
    }
}
