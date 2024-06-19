package Tests;

import Pages.HomePage;
import Pages.HotelSelectionPage;
import Pages.RafflesPage;
import Utils.Methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class BookARoom extends Methods {


    @Test
    public void RentARoom() throws InterruptedException, IOException {
        HomePage homePage = new HomePage();
        HotelSelectionPage hotelSelectionPage = new HotelSelectionPage();
        RafflesPage rafflesPage = new RafflesPage();

        homePage.siteLoading();
        homePage.clickHotelsButton();
        homePage.selectLondonAsDestination();
        homePage.selectDatesOfRoomBooking();
        homePage.selectRoomNumberOccupants();
        homePage.clickRoomSearchButton();
        hotelSelectionPage.clickOnRafflesLondonAtTheOWL();
        rafflesPage.selectConnorSuiteAndAddBreakfastInExtras();
    }
}
