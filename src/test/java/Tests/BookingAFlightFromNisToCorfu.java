package Tests;

import Pages.FeesPage;
import Pages.HomePage;
import Utils.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class BookingAFlightFromNisToCorfu {


    @Test
    public void TestMePage() throws InterruptedException, IOException {

        HomePage homePage = new HomePage();
        FeesPage feesPage = new FeesPage();

        homePage.siteLoading();
        homePage.checkTheReturnCheckBox();
        homePage.inTheFromFieldSelectNisInFromOption();
        homePage.inTheToFieldSelectCorfu();
        homePage.selectDatesOfTravel();
        homePage.selectPassengers();
        homePage.clickSearchButton();

        feesPage.selectFlights(Methods.driver);
        feesPage.selectPlusInTheChooseYourFare();
        feesPage.clickLoginLater();
        feesPage.selectMsInTheTitleDropdownMenu();
        feesPage.inputPassengerInformation();
        feesPage.clickContinueButton();
        Thread.sleep(3000);
        feesPage.selectSeatsOnFlightFromNisToCorfu();
        feesPage.handleSameSeatPopUp();
        feesPage.selectSeatOnFlightFromCorfuToNis();
        feesPage.clickOnFlightsContinueButton();
        Thread.sleep(5000);
        feesPage.clickAddFastTrack();
        Thread.sleep(3000);
        feesPage.selectPriorityPlusTwoCabinBags();
        Thread.sleep(6000);
        feesPage.clickBagContinueButton();
        Thread.sleep(4000);
        feesPage.arrangeBusInCorfuOption();
        feesPage.clickOnTransportationContinueButton();
    }
}