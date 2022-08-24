package base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public AndroidDriver driver;
    public WebDriverWait wait;


    public BasePage(AndroidDriver driver)   {
        this.driver = driver;
        wait = new WebDriverWait(driver,30,500);
    }

    public WebElement findElement(By by)    {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public String getText(By by) {
        return  wait.until(ExpectedConditions.presenceOfElementLocated(by)).getText();
    }

    public boolean isVisible(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by)).isDisplayed();
    }
    public void sendKeys(By by,CharSequence text)   {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }
    public void scrollDown(By by) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", findElement(by));

    }
    public void scrollDownDeneme(WebElement element) {
        TouchActions action = new TouchActions(driver);
        action.scroll(element, 10, 100);
        action.perform();


    }

    public void scrollToBottom(By by)    {
        int x = driver.manage().window().getSize().width / 2;
        int start_y = (int) (driver.manage().window().getSize().height * 0.7);
        int end_y = (int) (driver.manage().window().getSize().height * 0.2);

        (new TouchAction(driver))
                .press(PointOption.point(x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x,end_y))
                .release()
                .perform();
    }
}
