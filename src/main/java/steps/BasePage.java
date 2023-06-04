package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.Set;
import java.util.function.Function;

public class BasePage {

    private  JavascriptExecutor js;
    private WebDriver driver;
    private Wait<WebDriver> wait;

    protected BasePage(WebDriver driver) {
        this.js = (JavascriptExecutor) driver;
        this.driver = driver;
        this.wait = new FluentWait <WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }

    protected WebElement findElement(By locator){
        return (WebElement) wait.until(new Function<WebDriver, WebElement>(){
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }



    protected void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void click(By locator){
        findElement(locator).click();
    }

    protected String getText(By locator){
        return findElement(locator).getText();
    }


    public void driverWait(int miliSeconds){
        try {
            synchronized (driver)
            {
                driver.wait(miliSeconds);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollToElement(By by) {

        js.executeScript("window.scrollBy(0,2400)", "");
    }
    public void scrollToElement2(By by) {

        js.executeScript("window.scrollBy(0,2000)", "");
    }

    public void scrollDown(By locater) {


        js.executeScript("arguments[0].scrollIntoView(true);", findElement(locater));
    }


    protected void switchNewTab(String window){
        Set<String> handles = driver.getWindowHandles();
        for (String windowsHandle:handles
        ) {
            if (!window.equals(windowsHandle)){
                driver.switchTo().window(windowsHandle);
            }
        }
    }
}