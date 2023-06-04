package Tests;

import Base.BaseTest;
import Page.CareersPage;
import Page.LeverPage;
import Page.MainPage;
import Page.PositionsPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InsiderTests extends BaseTest {



    @Test
    public void insiderTest() throws InterruptedException{

        MainPage mainPage = new MainPage(driver);
        CareersPage careersPage = new CareersPage(driver);
        LeverPage leverPage = new LeverPage(driver);
        PositionsPage positionsPage = new PositionsPage(driver);


        Assertions.assertNotNull(mainPage.siteControl(),"Site acilmadi");
        mainPage.clickCookies();

        mainPage.menu();

        Assertions.assertNotNull(careersPage.insiderControl(),"Kariyer sekmesi açılmadı");
        Assertions.assertNotNull(careersPage.seeAllTeamsControl(),"Kariyer sekmesi açılmadı");
        Assertions.assertNotNull(careersPage.locationsControl(),"Kariyer sekmesi açılmadı");


        careersPage.QaPage();

        positionsPage.LocationJobs();

        String current = driver.getWindowHandle();
        leverPage.LeverControl();
        leverPage.switchTab(current);
        Assertions.assertEquals(leverPage.getLocation(),"ISTANBUL, TURKEY /","Girilen Konum Bilgisi Bulunamadı");


    }



}