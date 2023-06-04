package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.BasePage;


public class CareersPage extends BasePage {
    private final By SeeAllTeams = By.xpath("//*[text()='See all teams']");
    private final By insider = By.xpath("//h2[.='Life at Insider']");
    private final By Locations = By.cssSelector(".ml-0");
    private final By scrollElement = By.xpath("//h3[contains(.,'Find your calling')]");
    private final By QaJobs = By.cssSelector(".btn-outline-secondary");

    private final By QAclick = By.xpath("//*[text()='Quality Assurance']");


    public CareersPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement seeAllTeamsControl(){
        return findElement(SeeAllTeams);
    }
    public WebElement insiderControl(){
        return findElement(insider);
    }
    public WebElement locationsControl(){
        return findElement(Locations);
    }


    public void QaPage() throws InterruptedException {


        scrollToElement(scrollElement);
        Thread.sleep(3000);
        click(SeeAllTeams);
        scrollToElement2(QAclick);
        Thread.sleep(2000);
        click(QAclick);
        Thread.sleep(2000);
        click(QaJobs);


    }


}