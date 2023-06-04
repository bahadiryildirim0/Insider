package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.BasePage;

public class MainPage extends BasePage {

    private final By insiderDemo = By.xpath("//div[@class='d-flex flex-column align-items-center justify-content-center text-center']/a[.='Get a Demo']");
    private final By moreClick = By.xpath("//span[.='More']");
    private final By careersClick = By.xpath("//h5[.='Careers']");
    private final By cookies = By.id("wt-cli-accept-all-btn");

    public MainPage(WebDriver webDriver){
        super(webDriver);

    }

    public WebElement siteControl(){
        return findElement(insiderDemo);
    }
    public void clickCookies(){
        click(cookies);
    }
    public void menu(){
        waitUntilElementVisible(moreClick);
        click(moreClick);
        waitUntilElementVisible(careersClick);
        click(careersClick);
    }


}