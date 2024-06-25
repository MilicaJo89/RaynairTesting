package Tests;

import Pages.HomePage;
import Utils.Methods;
import org.testng.annotations.Test;

public class CheckAllLinks extends Methods {


    @Test
    public void TestingAllLinks() throws InterruptedException {

        HomePage homePage= new HomePage();

        homePage.siteLoading();
        homePage.clickHelpButton();
        homePage.clickSpecialAssistance();
        homePage.clickOnMyBooking();
        homePage.clickOnSignUpButton();
        homePage.clickOnLoginButton();
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
        homePage.inTheLanguageMenuOptionClickOnAustriaGerman();
        homePage.inTheLanguageMenuOptionClickOnBelgiumDutch();
        homePage.inTheLanguageMenuOptionClickOnBelgiumFrench();
        homePage.inTheLanguageMenuOptionClickOnBosniaEnglish();
        homePage.inTheLanguageMenuOptionClickOnBulgariaBulgarian();
        homePage.inTheLanguageMenuOptionClickOnChinaChinese();
        homePage.inTheLanguageMenuOptionClickOnCroatiaEnglish();
        homePage.inTheLanguageMenuOptionClickOnCyprusEnglish();
        homePage.inTheLanguageMenuOptionClickOnCzechRepublicCzech();
        homePage.inTheLanguageMenuOptionClickOnDenmarkDanish();
        homePage.inTheLanguageMenuOptionClickOnEstoniaEnglish();
        homePage.inTheLanguageMenuOptionClickOnFinlandEnglish();
        homePage.inTheLanguageMenuOptionClickOnFranceFrench();
        homePage.inTheLanguageMenuOptionClickOnGermanyGerman();
        homePage.inTheLanguageMenuOptionClickOnGreatBritainEnglish();
        homePage.inTheLanguageMenuOptionClickOnGreeceGreek();
        homePage.inTheLanguageMenuOptionClickOnHungaryHungarian();
        homePage.inTheLanguageMenuOptionClickOnIrelandEnglish();
        homePage.inTheLanguageMenuOptionClickOnItalyItalian();
        homePage.inTheLanguageMenuOptionClickOnLatviaEnglish();
        homePage.inTheLanguageMenuOptionClickOnLatviaLatvian();
        homePage.inTheLanguageMenuOptionClickOnLithuaniaLithuanian();
        homePage.inTheLanguageMenuOptionClickOnLuxembourgFrench();
        homePage.inTheLanguageMenuOptionClickOnMaltaEnglish();
        homePage.inTheLanguageMenuOptionClickOnMontenegroEnglish();
        homePage.inTheLanguageMenuOptionClickOnMoroccoFrench();
        homePage.inTheLanguageMenuOptionClickOnNetherlandsDutch();
        homePage.inTheLanguageMenuOptionClickOnNorwayNorwegian();
        homePage.inTheLanguageMenuOptionClickOnPolandPolish();
        homePage.inTheLanguageMenuOptionClickOnPortugalPortuguese();
        homePage.inTheLanguageMenuOptionClickOnRomaniaRomanian();
        homePage.inTheLanguageMenuOptionClickOnSerbiaEnglish();
        homePage.inTheLanguageMenuOptionClickOnSlovakiaEnglish();
        homePage.inTheLanguageMenuOptionClickOnSpainCatalan();
        homePage.inTheLanguageMenuOptionClickOnSpainSpanish();
        homePage.inTheLanguageMenuOptionClickOnSwedenSwedish();
        homePage.inTheLanguageMenuOptionClickOnTurkeyEnglish();
        homePage.inTheLanguageMenuOptionClickOnUkraineUkrainian();
        homePage.inTheLanguageMenuOptionClickOnUnitedStatesEnglish();
        homePage.clickOnLogoForRyanAirInTheUpperLeftCorner();
    }
}