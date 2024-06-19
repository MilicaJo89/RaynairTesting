package Tests;

import Pages.FeesPage;
import Pages.HomePage;
import Utils.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class BookingAFlightFromNisToCorfu extends Methods {


    @Test
    public void TestMePage() throws InterruptedException, IOException {

        HomePage homePage = new HomePage();
        FeesPage feesPage = new FeesPage();

        homePage.siteLoading();
        homePage.checkTheReturnCheckBox();
        homePage.selectNisInFromOption();
        homePage.selectCorfuInDestination();
        homePage.selectDatesOfTravel();
        homePage.selectPassengers();
        homePage.clickSearchButton();
        feesPage.selectFlights(Methods.driver);
        feesPage.selectPlusFlightOption();
        feesPage.clickLoginLater();
        feesPage.selectMsInTheTitleDropdownMenu();
        feesPage.inputPassengerInformation();
        feesPage.clickContinueButton();
        feesPage.selectSeatsOnFlightFromNisToCorfu();
        feesPage.handleSameSeatPopUp();
        feesPage.selectSeatOnFlightFromCorfuToNis();
        feesPage.clickOnFlightsContinueButton();
        feesPage.clickAddFastTrack();
        feesPage.selectCabinBag();
        Thread.sleep(5000);
        feesPage.clickBagContinueButton();
        feesPage.arrangeBusInCorfuOption();
        feesPage.clickOnTransportationContinueButton();
    }
}