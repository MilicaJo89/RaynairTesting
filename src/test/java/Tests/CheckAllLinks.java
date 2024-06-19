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
        homePage.clickOnFareFinder();
        homePage.clickOnRouteMap();
        homePage.clickOnDestination();
        homePage.clickOnTimetable();
        homePage.clickOnTrySomethingNew();
        homePage.clickGroupTravel();
        homePage.clickOnTheOnlinePirate();
        homePage.customerTestimonials();
        homePage.clickFlightEssentials();
        homePage.clickOnFareBundles();
        homePage.clickOnSearchCar();
        homePage.clickOnSearchRooms();
        homePage.clickOnSearchEvents();
        homePage.clickOnSearchParking();
        homePage.clickOnPrivateTransfer();
        homePage.clickOnBusAndTrains();
        homePage.clickOnGiftCard();
        homePage.clickOnOnBoardServices();
        homePage.clickOnAustriaGerman();
        homePage.clickOnBelgiumDutch();
        homePage.clickOnBelgiumFrench();
        homePage.clickOnBosniaEnglish();
        homePage.clickOnBulgariaBulgarian();
        homePage.clickOnChinaChinese();
        homePage.clickOnCroatiaEnglish();
        homePage.clickOnCyprusEnglish();
        homePage.clickOnCzechRepublicCzech();
        homePage.clickOnDenmarkDanish();
        homePage.clickOnEstoniaEnglish();
        homePage.clickOnFinlandEnglish();
        homePage.clickOnFranceFrench();
        homePage.clickOnGermanyGerman();
        homePage.clickOnGreatBritainEnglish();
        homePage.clickOnGreeceGreek();
        homePage.clickOnHungaryHungarian();
        homePage.clickOnIrelandEnglish();
        homePage.clickOnItalyItalian();
        homePage.clickOnLatviaEnglish();
        homePage.clickOnLatviaLatvian();
        homePage.clickOnLithuaniaLithuanian();
        homePage.clickOnLuxembourgFrench();
        homePage.clickOnMaltaEnglish();
        homePage.clickOnMontenegroEnglish();
        homePage.clickOnMoroccoFrench();
        homePage.clickOnNetherlandsDutch();
        homePage.clickOnNorwayNorwegian();
        homePage.clickOnPolandPolish();
        homePage.clickOnPortugalPortuguese();
        homePage.clickOnRomaniaRomanian();
        homePage.clickOnSerbiaEnglish();
        homePage.clickOnSlovakiaEnglish();
        homePage.clickOnSpainCatalan();
        homePage.clickOnSpainSpanish();
        homePage.clickOnSwedenSwedish();
        homePage.clickOnTurkeyEnglish();
        homePage.clickOnUkraineUkrainian();
        homePage.clickOnUnitedStatesEnglish();
        homePage.clickOnLogoForRyanAir();
    }


}