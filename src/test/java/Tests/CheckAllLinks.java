package Tests;

import Pages.HomePage;
import Pages.NavigationMenuPage;
import Utils.Methods;
import org.testng.annotations.Test;

public class CheckAllLinks {
    
    @Test
    public void TestingAllLinks() throws InterruptedException {

        HomePage homePage = new HomePage();
        NavigationMenuPage navigationMenuPage = new NavigationMenuPage();


        homePage.siteLoading();
        navigationMenuPage.clickHelpButton();
        homePage.clickSpecialAssistance();
        navigationMenuPage.clickOnMyBooking();
        navigationMenuPage.clickOnSignUpButton();
        navigationMenuPage.clickOnLoginButton();

        //plan drop down menu tests
        homePage.inThePlanMenuOptionClickOnFareFinder();
        homePage.inThePlanMenuOptionClickOnRouteMap();
        homePage.inThePlanMenuOptionClickOnDestinations();
        homePage.inThePlanMenuOptionClickOnTimetable(Methods.driver);
        homePage.inThePlanMenuOptionClickOnTrySomewhereNew();
        homePage.inThePlanMenuOptionClickGroupTravel();
        homePage.inThePlanMenuOptionClickOnTheOnlineTravelPirateScams();
        homePage.inThePlanMenuOptionClickCustomerTestimonials();
        homePage.inThePlanMenuOptionClickFlightEssentials();
        homePage.inThePlanMenuOptionClickOnFareBundles();
        homePage.inThePlanMenuOptionClickOnSearchCarHire();
        homePage.inThePlanMenuOptionClickOnSearchRooms();
        homePage.inThePlanMenuOptionClickOnSearchEventsAndActivities();
        homePage.inThePlanMenuOptionClickOnSearchParking();
        homePage.inThePlanMenuOptionClickOnSearchPrivateTransfers();
        homePage.inThePlanMenuOptionClickOnSearchBusAndTrains();
        homePage.inThePlanMenuOptionClickOnRyanairGiftCards();
        homePage.inThePlanMenuOptionClickOnOnboardServices();

        //language menu testing
        homePage.inTheLanguageMenuOption("austria");
        homePage.inTheLanguageMenuOption("belgium dutch");
        homePage.inTheLanguageMenuOption("belgium french");
        homePage.inTheLanguageMenuOption("bosnia");
        homePage.inTheLanguageMenuOption("bulgaria");
        homePage.inTheLanguageMenuOption("china");
        homePage.inTheLanguageMenuOption("croatia");
        homePage.inTheLanguageMenuOption("cyprus");
        homePage.inTheLanguageMenuOption("czech");
        homePage.inTheLanguageMenuOption("denmark");
        homePage.inTheLanguageMenuOption("estonia");
        homePage.inTheLanguageMenuOption("finland");
        homePage.inTheLanguageMenuOption("france");
        homePage.inTheLanguageMenuOption("germany");
        homePage.inTheLanguageMenuOption("great britain");
        homePage.inTheLanguageMenuOption("greece");
        homePage.inTheLanguageMenuOption("hungary");
        homePage.inTheLanguageMenuOption("ireland");
        homePage.inTheLanguageMenuOption("italy");
        homePage.inTheLanguageMenuOption("latvia english");
        homePage.inTheLanguageMenuOption("latvia latvian");
        homePage.inTheLanguageMenuOption("lithuania");
        homePage.inTheLanguageMenuOption("luxembourg");
        homePage.inTheLanguageMenuOption("malta");
        homePage.inTheLanguageMenuOption("montenegro");
        homePage.inTheLanguageMenuOption("morocco");
        homePage.inTheLanguageMenuOption("netherlands");
        homePage.inTheLanguageMenuOption("norway");
        homePage.inTheLanguageMenuOption("poland");
        homePage.inTheLanguageMenuOption("portugal");
        homePage.inTheLanguageMenuOption("romania");
        homePage.inTheLanguageMenuOption("serbia");
        homePage.inTheLanguageMenuOption("slovakia");
        homePage.inTheLanguageMenuOption("spain catalan");
        homePage.inTheLanguageMenuOption("spain spanish");
        homePage.inTheLanguageMenuOption("sweden");
        homePage.inTheLanguageMenuOption("turkey");
        homePage.inTheLanguageMenuOption("ukraine");
        homePage.inTheLanguageMenuOption("united states");

        navigationMenuPage.clickOnLogoForRyanAirInTheUpperLeftCorner();


    }
}