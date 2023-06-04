package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.BasePage;


public class LeverPage extends BasePage {
    private final By control = By.xpath("//*[text()='Senior Software Quality Assurance Engineer - Remote']");
    private final By location = By.xpath("//div[@class='sort-by-time posting-category medium-category-label location']");
    public LeverPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void LeverControl() throws InterruptedException {

        Thread.sleep(1000);
        waitUntilElementVisible(control);

    }

    public void switchTab(String window){
        switchNewTab(window);
    }

    public String getLocation(){
        return getText(location);
    }
}