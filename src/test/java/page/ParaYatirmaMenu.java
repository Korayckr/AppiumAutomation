package page;
import base.BasePage;
import io.appium.java_client.android.AndroidDriver;

import static constant.Utilities.*;

public class ParaYatirmaMenu extends BasePage {

    public ParaYatirmaMenu(AndroidDriver driver) {super(driver);}
    public void clickTutarAlani()   {
        clickElement(TUTAR);
    }
    public void sendTutar() {
        sendKeys(TUTAR_GIR,"25");
    }
    public void sendAciklama()  {
        sendKeys(ACIKLAMA,"Açıklama");
    }
    public void clickDevamBtn() {
        clickElement(DEVAM);
    }


}
