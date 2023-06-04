package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.BasePage;

public class PositionsPage extends BasePage {


    private final By Locationid = By.id("select2-filter-by-location-container");
    private final By scroll = By.xpath("//h3[@class='mb-0']");
    private final By ilanControl = By.xpath("//div[@id='jobs-list']/div[@class='position-list-item col-12 col-lg-4 qualityassurance istanbul-turkey full-timeremote']/div[contains(.,'Senior Software Quality Assurance Engineer - RemoteQuality AssuranceIstanbul, Tu')]");
    private final By Filter = By.xpath("//a[@href='https://jobs.lever.co/useinsider/78ddbec0-16bf-4eab-b5a6-04facb993ddc']");
    private final By Location = By.xpath("//li[.='Istanbul, Turkey']");
    public PositionsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void LocationJobs() throws InterruptedException {

        scrollDown(scroll);
        Thread.sleep(2000);
        click(Locationid);
        Thread.sleep(1000);
        click(Location);
        Thread.sleep(2000);
        waitUntilElementVisible(ilanControl);
        click(Filter);
        Thread.sleep(2000);

    }
}