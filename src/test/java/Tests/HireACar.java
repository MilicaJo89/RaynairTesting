package Tests;

import Pages.CarHirePage;
import Pages.HomePage;
import org.testng.annotations.Test;

import java.io.IOException;

public class HireACar {

    @Test
    public void hireACarTest() throws InterruptedException, IOException {
        HomePage homePage = new HomePage();
        CarHirePage carHirePage = new CarHirePage();



        homePage.siteLoading();
        homePage.clickHireCarButton();
        Thread.sleep(4000);
        carHirePage.inputInToINeedACarTextFieldDublin();
        Thread.sleep(5000);
        carHirePage.selectJune30thAsPickUpDate();
        carHirePage.selectJuly10thAsDropOffDate();
        carHirePage.select1200AsPickUpTime();
        carHirePage.select1230AsDropOffTime();
        carHirePage.clickLetsGoButton();
        Thread.sleep(10000);
        carHirePage.underTheTransmissionSelectAutomatic();
        carHirePage.underTheCarSpecsSelectAirConditioning();
        carHirePage.selectPremiumCarOption();
        Thread.sleep(9000);
        carHirePage.selectACarToHire();
        Thread.sleep(5000);
        carHirePage.clickContinueToBookButton();
        carHirePage.clickGoToBookWithFullProtectionButton();
    }
}
