package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.ParaYatirmaMenu;


public class ParaYatirmaMenuTest extends BaseTest {

    ParaYatirmaMenu paraYatirmaMenu = new ParaYatirmaMenu(driver);

    @Step("Tutar alanı tıklanır.")
    public void clickTutar()    {paraYatirmaMenu.clickTutarAlani();
    }
    @Step("Tutar girilir.")
    public void sendTutarBox()  {paraYatirmaMenu.sendTutar();
    }
    @Step("Açıklama girilir")
    public void sendAciklamaA() {paraYatirmaMenu.sendAciklama();
    }
    @Step("Devam butonu tıklanır.")
    public void clickDevam()    {paraYatirmaMenu.clickDevamBtn();
    }



}
