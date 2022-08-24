package constant;

import org.openqa.selenium.By;

public class Utilities {

    //Login Page
    public static final By AKT_GRS = By.id("com.vakifbank.mobile.beta:id/vsLoginDirect");
    public static final By LOGIN_TEXT = By.id("com.vakifbank.mobile.beta:id/editTextCustomerNumber");

    public static final By DEVAM_BTN = By.id("com.vakifbank.mobile.beta:id/buttonForward");

    //Main Page
    public static final By TUM_ISLEMLER = By.id("com.vakifbank.mobile.beta:id/action_all_process");

    //Tum Islemler Menusu
    public static final By  YATIRIM_MENU = By.xpath("//*[@resource-id='com.vakifbank.mobile.beta:id/textMenuName'][@text='Yatırım']");

    //Yatırım menu
    public static final By PARA_YATIRMA = By.xpath("//*[@resource-id='com.vakifbank.mobile.beta:id/textMenuName'][@text='Para Yatırma']");
   // public static final By ALN_HESAP_SEC = By.xpath("//*[@class='android.widget.TextView'][@text='Vadesiz']");
   // public static final By VAD_HESAP_SEC = By.xpath("//*[@class='android.widget.TextView'][@text='Vadesiz']");
   // public static final By AKT_HESAP_SEC = By.xpath("(//*[@class='android.view.View'][@text='Bakiye'])[2]");
   // public static final By YAT_HESAP_SEC = By.xpath("//*[@class='android.view.View'][@text='Bakiye']");
    public static final By TUTAR = By.xpath("//*[@resource-id='moneyControlLabel']");
    public static final By TUTAR_GIR = By.xpath("//*[@resource-id='Amount1']");
    public static final By ACIKLAMA = By.xpath("//*[@resource-id='Description']");
    public static final By DEVAM = By.xpath("//*[@resource-id='btn_devam']");

    //Onay ekranı
    public static final By ONAY_BTN = By.xpath("//*[@resource-id='btn_Onay']");

    //Onaylanma Kontrol Ekranı
    public static final By ONAY_IKON = By.xpath("//*[@class='android.widget.Image'][@text='Onay']");

}
