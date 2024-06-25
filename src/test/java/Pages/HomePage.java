package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class HomePage extends Methods {


    public WebDriver driver;

    public HomePage homePage(WebDriver driver) {
        this.driver=driver;
        return this;
    }


    //paths for flight from nis to corfu
    public By returnCheckBox = By.xpath("//label[@class='ry-radio-circle-button__label']");
    public By fromDropdown = By.xpath("//input[@class='input-button__input ng-star-inserted']");
    public By clickSerbia = By.xpath("//span[contains(.,' Serbia ')]");
    public By clickNis = By.xpath("//span[@data-id='INI']");
    public By clickGreece = By.xpath("//span[contains(.,' Greece ')]");
    public By clickCorfu = By.xpath("//span[@data-id='CFU']");
    public By selectJune30th = By.xpath("//div[@data-id='2024-06-30']");
    public By selectJuly28th = By.xpath("//div[@data-id='2024-07-28']");
    public By checkPassenger = By.xpath("//div[contains(.,' 1 ')]");
    public By buttonDone = By.xpath("//button[@class='passengers__confirm-button ry-button--anchor-blue ry-button--anchor']");
    public By searchButton = By.xpath("//button[@class='flight-search-widget__start-search-cta ng-tns-c983940023-3 ry-button--gradient-yellow']");


    //paths for all links
    public By clickHelp = By.xpath("//span[@class='ng-star-inserted' and contains(.,'Help ')]");
    public By YesIAgree = By.xpath("//button[@class='cookie-popup-with-overlay__button-settings']");
    public By AllowAll = By.xpath("//button[@class='cookies-details__allow-all-button ry-button--gradient-blue ng-star-inserted']");
    public By Done = By.xpath("//button[@class='cookies-details__done-button ry-button--gradient-yellow ng-star-inserted']");
    public By specialAsistance = By.xpath("//a[@aria-label='Assistance']");
    public By myBooking = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor']");
    public By signUp = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor' and contains(.,' Sign up')]");
    public By xMarksTheSpot = By.xpath("//button//icon[@iconid='glyphs/close-takeover']");
    public By logIn = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor' and contains(.,' Log in')]");
    public By query = By.xpath("//input[@id='query']");
    public By emailElement = By.xpath("//div[@class='titles']");
    public By signInElement = By.xpath("//input[@class='body-l-lg body-l-sm date-placeholder invisible-background']");
    public By plan = By.xpath("//span[contains(.,'Plan ')]");
    public By fareFinder = By.xpath("//a[@aria-label='Fare Finder']");
    public By cookieprivacy = By.xpath("//button[@class='cookie-popup-with-overlay__button']");
    public By cheapFlightsTitle = By.xpath("//h1[@class='row-fares-search-title']");
    public By privacyButtonHomePage = By.xpath("//button[@class='cookie-popup-with-overlay__button-settings']");
    public By RouteMap = By.xpath("//a[@aria-label='Route map']");
    public By routeMapPrivacy = By.xpath("//button[@class='cookie-popup-with-overlay__button']");
    public By routeElement = By.xpath("//div[@class='searchbox-label-departures']");
    public By Destination = By.xpath("//a[@aria-label='Destinations']");
    public By DestinationElement = By.xpath("//h1[@class='seo-hero-image-title']");
    public By Timetable = By.xpath("//a[@aria-label='Timetable']");
    public By timetableElement = By.xpath("//h1[@class='timetable-header title-xl-lg']");
    public By timetableprivacy = By.xpath("//button[@class='cookie-popup-with-overlay__button-settings']");
    public By TrySomethingNew = By.xpath("//a[@aria-label='Try Somewhere New']");
    public By somethingPrivacy = By.xpath("//button[@class='cookie-popup-with-overlay__button']");
    public By somethingElement = By.xpath("//h1[@class='container te-primary-title fadeInUp']");
    public By GroupTravel = By.xpath("//a[@aria-label='Group Travel']");
    public By GroupTravelElement = By.xpath("//img[@class='image-wrapper__image']");
    public By OnlinePirate = By.xpath("//a[@aria-label='Online Travel Pirate scams']");
    public By OnlinePirateElement = By.xpath("//img[@class='image-wrapper__image']");
    public By Testimonials = By.xpath("//a[@aria-label='Customer Testimonials']");
    public By TestimonialsElement = By.xpath("//span[contains(.,'Blow our own trumpets? We would never.')]");
    public By flightEssentials = By.xpath("//a[@aria-label='Flight Essentials']");
    public By flightEssentialsElement = By.xpath("//span[contains(.,'Make sure you book everything you need for a hassle-free trip')]");
    public By fareBundles = By.xpath("//a[@aria-label='Fare Bundles']");
    public By fareBundlesElement = By.xpath("//span[contains(.,'From check-in bags to guaranteed reserved seats,')]");
    public By searchCars = By.xpath("//a[@aria-label='Search Car Hire']");
    public By searchCarsElement = By.xpath("//h1[contains(.,'Car Rental – Search, Compare & Save')]");
    public By searchRooms = By.xpath("//a[@aria-label='Search Rooms']");
    public By searchRoomsElement = By.xpath("//h1[contains(.,'Search stays')]");
    public By searchEvents = By.xpath("//a[@aria-label='Search Events and Activities']");
    public By searchEventsElement = By.xpath("//div[@class='tooltip-selector location-selector__dropdown location-searchbar__location-selector']");
    public By searchParking = By.xpath("//a[@aria-label='Search Parking']");
    public By searchParkingElement = By.xpath("//h2[contains(.,'Airport Parking made simple')]");
    public By privateTransfers = By.xpath("//a[@aria-label='Search Private Transfers']");
    public By privateTransfersElement = By.xpath("//div[@class='_4aslK']");
    public By busAndTrain = By.xpath("//a[@aria-label='Search Bus and Train']");
    public By busAndTrainElement = By.xpath("//h3[contains(.,'Bus, Coach & Taxi Airport Transfers')]");
    public By ryanairGiftCard = By.xpath("//a[@aria-label='Ryanair Gift Cards']");
    public By ryanairGiftCardElement = By.xpath("//span[contains(.,'Looking for the perfect gift?')]");
    public By onBoardServices = By.xpath("//a[@aria-label='Onboard Services']");
    public By onBoardServicesElement = By.xpath("//span[contains(.,'Fast Track: food, drink & duty free')]");
    public By languageMenu = By.xpath("//button[@class='language-selector__button ng-star-inserted']");
    public By AustriaGerman = By.xpath("//a[@href='/at/de']");
    public By AustriaGermanElement = By.xpath("//button[contains(.,' Registrieren')]");
    public By BelgiumDutch = By.xpath("//a[@href='/be/nl']");
    public By BelgiumDutchElement = By.xpath("//button[contains(.,' Registreren')]");
    public By BelgiumFrench = By.xpath("//a[@href='/be/fr']");
    public By BelgiumFrenchElement = By.xpath("//button[contains(.,' S’inscrire')]");
    public By BosniaEnglish = By.xpath("//a[@href='/ba/en']");
    public By BosniaEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By BulgariaBulgarian = By.xpath("//a[@href='/bg/bg']");
    public By BulgariaBulgarianElement = By.xpath("//button[contains(.,' Записване')]");
    public By ChinaChinese = By.xpath("//a[@href='/cn/zh']");
    public By ChinaChineseElement = By.xpath("//button[contains(.,' 注册')]");
    public By CroatiaEnglish = By.xpath("//a[@href='/hr/en']");
    public By CroatiaEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By CyprusEnglish = By.xpath("//a[@href='/cy/en']");
    public By CyprusEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By CzechRepublicCzech = By.xpath("//a[@href='/cz/cs']");
    public By CzechRepublicCzechElement = By.xpath("//button[contains(.,' Zaregistrovat')]");
    public By DenmarkDanish = By.xpath("//a[@href='/dk/da']");
    public By DenmarkDanishElement = By.xpath("//button[contains(.,' Meld dig til')]");
    public By EstoniaEnglish = By.xpath("//a[@href='/ee/en']");
    public By EstoniaEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By FinlandEnglish = By.xpath("//a[@href='/fi/en']");
    public By FinlandEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By FranceFrench = By.xpath("//a[@href='/fr/fr']");
    public By FranceFrenchElement = By.xpath("//button[contains(.,' S’inscrire')]");
    public By GermanyGerman = By.xpath("//a[@href='/de/de']");
    public By GermanyGermanElement = By.xpath("//button[contains(.,' Registrieren')]");
    public By GreatBritainEnglish = By.xpath("//a[@href='/gb/en']");
    public By GreatBritainEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By GreeceGreek = By.xpath("//a[@href='/gr/el']");
    public By GreeceGreekElement = By.xpath("//button[contains(.,' Εγγραφή')]");
    public By HungaryHungarian = By.xpath("//a[@href='/hu/hu']");
    public By HungaryHungarianElement = By.xpath("//button[contains(.,' Regisztrálás')]");
    public By IrelandEnglish = By.xpath("//a[@href='/ie/en']");
    public By IrelandEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By ItalyItalian = By.xpath("//a[@href='/it/it']");
    public By ItalyItalianElement = By.xpath("//button[contains(.,' Iscriviti')]");
    public By LatviaEnglish = By.xpath("//a[@href='/lv/en']");
    public By LatviaEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By LatviaLatvian = By.xpath("//a[@href='/lv/lv']");
    public By LatviaLatvianElement = By.xpath("//button[contains(.,' Reģistrēties')]");
    public By LithuaniaLithuanian = By.xpath("//a[@href='/lt/lt']");
    public By LithuaniaLithuanianElement = By.xpath("//button[contains(.,' Registruotis')]");
    public By LuxembourgFrench = By.xpath("//a[@href='/lu/fr']");
    public By LuxembourgFrenchElement = By.xpath("//button[contains(.,' S’inscrire')]");
    public By MaltaEnglish = By.xpath("//a[@href='/mt/en']");
    public By MaltaEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By MontenegroEnglish = By.xpath("//a[@href='/me/en']");
    public By MontenegroEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By MoroccoFrench = By.xpath("//a[@href='/ma/fr']");
    public By MoroccoFrenchElement = By.xpath("//button[contains(.,' S’inscrire')]");
    public By NetherlandsDutch = By.xpath("//a[@href='/nl/nl']");
    public By NetherlandsDutchElement = By.xpath("//button[contains(.,' Registreren')]");
    public By NorwayNorwegian = By.xpath("//a[@href='/no/no']");
    public By NorwayNorwegianElement = By.xpath("//button[contains(.,' Registrer deg')]");
    public By PolandPolish = By.xpath("//a[@href='/pl/pl']");
    public By PolandPolishElement = By.xpath("//button[contains(.,' Zarejestruj się')]");
    public By PortugalPortuguese = By.xpath("//a[@href='/pt/pt']");
    public By PortugalPortugueseElement = By.xpath("//button[contains(.,' Inscreva-se')]");
    public By RomaniaRomanian = By.xpath("//a[@href='/ro/ro']");
    public By RomaniaRomanianElement = By.xpath("//button[contains(.,' Înregistrează-te')]");
    public By SerbiaEnglish = By.xpath("//a[@href='/sr/en']");
    public By SerbiaEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By SlovakiaEnglish = By.xpath("//a[@href='/sk/en']");
    public By SlovakiaEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By SpainCatalan = By.xpath("//a[@href='/es/ca']");
    public By SpainCatalanElement = By.xpath("//button[contains(.,' Registrar-me')]");
    public By SpainSpanish = By.xpath("//a[@href='/es/es']");
    public By SpainSpanishElement = By.xpath("//button[contains(.,' Registrarse')]");
    public By SwedenSwedish = By.xpath("//a[@href='/se/sv']");
    public By SwedenSwedishElement = By.xpath("//button[contains(.,' Anmäl dig')]");
    public By TurkeyEnglish = By.xpath("//a[@href='/tr/en']");
    public By TurkeyEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By UkraineUkrainian = By.xpath("//a[@href='/ua/uk']");
    public By UkraineUkrainianElement = By.xpath("//button[contains(.,' Зареєструватися')]");
    public By UnitedStatesEnglish = By.xpath("//a[@href='/us/en']");
    public By UnitedStatesEnglishElement = By.xpath("//button[contains(.,' Sign up')]");
    public By logoForRyanAir = By.xpath("//div[@class='common-header__logo']");


    //paths for room booking
    public By HotelsButton = By.xpath("//div[@class='tab-text ng-star-inserted' and contains(.,'hotels')]");
    public By destinationTextBox = By.xpath("//input[@id='input-button__locations-or-properties']");
    public By London2 = By.xpath("//div[@data-ref='location-item__name' and contains(.,'London, England')]");
    public By chooseDateOfTravel = By.xpath("//div[@data-ref='input-button__display-value']");
    public By june30 = By.xpath("//div[@data-id='2024-06-30']");
    public By july10 = By.xpath("//div[@data-id='2024-07-10']");
    public By passengerAdd = By.xpath("//div[@data-ref='counter.counter__increment']");
    public By done = By.xpath("//button[@class='rooms_done-button ry-button--anchor-blue ry-button--anchor']");
    public By SearchButton = By.xpath("//button[@class='rooms-search-widget__start-search ry-button--gradient-yellow']");



    //paths for event booking
    public By clickEvents= By.xpath("//div[@class='tab-text ng-star-inserted' and contains(.,'Events & Activities')]");

    //paths for car hire
    public By clickCarHire = By.xpath("//div[@class='tab-text ng-star-inserted' and contains(.,'Car Hire')]");



    public void siteLoading() throws InterruptedException {
        logger.info("Site opens");
        setUp();
        Thread.sleep(3000);
        logger.info("Pop up appears and click button Yes,I Agree");
        clickOnElement(YesIAgree);
        Thread.sleep(5000);
        logger.info("Click Allow all in the cookies privacy pop up");
        scrollIntoViewAndClick(AllowAll);
        Thread.sleep(5000);
        logger.info("Click Done button in the cookies privacy pop up");
        scrollIntoViewAndClick(Done);
    }

    public void clickHelpButton() throws InterruptedException {
        logger.info("Click Help");
        clickOnElement(clickHelp);
        Thread.sleep(3000);
        logger.info("Driver switches pages");
        driverSwitch();
        logger.info("Help page element is present");
        elementIsPresent(query);
        logger.info("Driver switches pages");
        driverSwitchBack();
        logger.info("Close the tab window");
        closeTab();
    }

    public void clickSpecialAssistance() throws InterruptedException {
        logger.info("Click on the Special Assistance element");
        clickOnElement(specialAsistance);
        Thread.sleep(5000);
        logger.info("Driver switches pages");
        driverSwitch();
        logger.info("Check url link");
        checkUrlLink();
        logger.info("Driver switches pages");
        driverSwitchBack();
        logger.info("Close the tab window");
        closeTab();
        Thread.sleep(5000);
    }

    public void clickOnMyBooking() throws InterruptedException {
        logger.info("Click on the myBooking element");
        clickOnElement(myBooking);
        Thread.sleep(5000);
        logger.info("Email element is present");
        elementIsPresent(emailElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void clickOnSignUpButton() throws InterruptedException {
        logger.info("Click sign up element");
        clickOnElement(signUp);
        logger.info("Element is present");
        elementIsPresent(signInElement);
        Thread.sleep(3000);
        logger.info("Click X to close the pop up window");
        clickOnElement(xMarksTheSpot);
    }

    public void clickOnLoginButton() throws InterruptedException {
        logger.info("Click Login button");
        clickOnElement(logIn);
        logger.info("Login element is present");
        elementIsPresent(signInElement);
        Thread.sleep(3000);
        logger.info("Click X to close the pop up window");
        clickOnElement(xMarksTheSpot);
    }

    public void inThePlanMenuOptionClickOnFareFinder() throws InterruptedException {
        Thread.sleep(3000);
        logger.info("Click on the plan element");
        clickOnElement(plan);
        Thread.sleep(3000);
        logger.info("Click on FareFinder");
        clickOnElement(fareFinder);
        Thread.sleep(5000);
        logger.info("Click on cookie privacy");
        clickOnElement(cookieprivacy);
        Thread.sleep(5000);
        logger.info("Cheap flights element is present");
        elementIsPresent(cheapFlightsTitle);
        Thread.sleep(3000);
        logger.info("Click <- to go back to home page");
        goBack();
        logger.info("Click on home page privacy button");
        clickOnElement(privacyButtonHomePage);
        Thread.sleep(5000);
        logger.info("Click allow all button");
        scrollIntoViewAndClick(AllowAll);
        Thread.sleep(5000);
        logger.info("Click Done button in the cookies privacy pop up");
        scrollIntoViewAndClick(Done);
    }

    public void inThePlanMenuOptionClickOnRouteMap() throws InterruptedException {
        logger.info("Click on the plan element");
        clickOnElement(plan);
        Thread.sleep(3000);
        logger.info("Click on Route map element");
        clickOnElement(RouteMap);
        Thread.sleep(3000);
        logger.info("Click on the route privacy button");
        clickOnElement(routeMapPrivacy);
        Thread.sleep(5000);
        logger.info("Route Map element is present");
        elementIsPresent(routeElement);
        Thread.sleep(4000);
        logger.info("Click <- to go back to home page");
        goBack();
        Thread.sleep(5000);
        logger.info("Click on home page privacy button");
        clickOnElement(privacyButtonHomePage);
        Thread.sleep(5000);
        logger.info("Click allow all button");
        scrollIntoViewAndClick(AllowAll);
        Thread.sleep(5000);
        logger.info("Click Done button in the cookies privacy pop up");
        scrollIntoViewAndClick(Done);
    }

    public void inThePlanMenuOptionClickOnDestinations() throws InterruptedException {
        logger.info("Click on the plan element");
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on Destination button");
        clickOnElement(Destination);
        Thread.sleep(5000);
        logger.info("Destination element is present");
        elementIsPresent(DestinationElement);
        Thread.sleep(5000);
        logger.info("Click <- to go back to home page");
        goBack();
        Thread.sleep(5000);
    }

    public void inThePlanMenuOptionClickOnTimetable(WebDriver driver) throws InterruptedException {
        logger.info("Click on the plan element");
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Timetable button");
        clickOnElement(Timetable);
        Thread.sleep(7000);
        logger.info("Click on the timetable privacy");
        clickOnElement(timetableprivacy);
        Thread.sleep(4000);
        logger.info("Click on allow all button");
        scrollIntoViewAndClick(AllowAll);
        Thread.sleep(5000);
        logger.info("Click Done button in the cookies privacy pop up");
        scrollIntoViewAndClick(Done);
        Thread.sleep(6000);
        logger.info("Timetable element is present");
        elementIsPresent(timetableElement);
        logger.info("Click <- to go back to home page");
        driver.navigate().to("https://www.ryanair.com/gb/en");
        Thread.sleep(5000);
    }

    public void inThePlanMenuOptionClickOnTrySomewhereNew() throws InterruptedException {
        logger.info("Click on the plan element");
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on Try Something New button");
        clickOnElement(TrySomethingNew);
        Thread.sleep(5000);
        logger.info("Click Try Something New privacy button");
        clickOnElement(somethingPrivacy);
        Thread.sleep(5000);
        logger.info("Try Something New element is present");
        elementIsPresent(somethingElement);
        logger.info("Click <- to go back to home page");
        goBack();
        Thread.sleep(5000);
        logger.info("Click on the Home page button");
        clickOnElement(privacyButtonHomePage);
        Thread.sleep(5000);
        logger.info("Click allow all button");
        scrollIntoViewAndClick(AllowAll);
        Thread.sleep(5000);
        logger.info("Click Done button in the cookies privacy pop up");
        scrollIntoViewAndClick(Done);
    }

    public void inThePlanMenuOptionClickGroupTravel() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Group Travel button");
        clickOnElement(GroupTravel);
        Thread.sleep(5000);
        logger.info("Group Travel element is present");
        elementIsPresent(GroupTravelElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnTheOnlineTravelPirateScams() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Online Pirate button");
        clickOnElement(OnlinePirate);
        Thread.sleep(5000);
        logger.info("Online Pirate element is present");
        elementIsPresent(OnlinePirateElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickCustomerTestimonials() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on Testimonials element");
        clickOnElement(Testimonials);
        Thread.sleep(5000);
        logger.info("Testimonials element is present");
        elementIsPresent(TestimonialsElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickFlightEssentials() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on Flight Essentials button");
        clickOnElement(flightEssentials);
        Thread.sleep(5000);
        logger.info("Flight Essentials element is present");
        elementIsPresent(flightEssentialsElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnFareBundles() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on Fare Bundles button");
        clickOnElement(fareBundles);
        Thread.sleep(5000);
        logger.info("Fare Bundles element is present");
        elementIsPresent(fareBundlesElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnSearchCarHire() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Search Cars button");
        clickOnElement(searchCars);
        Thread.sleep(5000);
        logger.info("Search Cars element is present");
        elementIsPresent(searchCarsElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnSearchRooms() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Search Rooms button");
        clickOnElement(searchRooms);
        Thread.sleep(5000);
        logger.info("Search Room element is present");
        elementIsPresent(searchRoomsElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnSearchEventsAndActivities() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on search event button");
        clickOnElement(searchEvents);
        Thread.sleep(5000);
        logger.info("Search element is present");
        elementIsPresent(searchEventsElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnSearchParking() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Search Parking button");
        clickOnElement(searchParking);
        Thread.sleep(5000);
        logger.info("Search Parking element is present");
        elementIsPresent(searchParkingElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnSearchPrivateTransfers() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Private Transfers button");
        clickOnElement(privateTransfers);
        Thread.sleep(5000);
        logger.info("Private Transfers element is present");
        elementIsPresent(privateTransfersElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnSearchBusAndTrains() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Bus and Train button");
        clickOnElement(busAndTrain);
        Thread.sleep(5000);
        logger.info("Bus and Train element is present");
        elementIsPresent(busAndTrainElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnRyanairGiftCards() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the Gift Card button");
        clickOnElement(ryanairGiftCard);
        Thread.sleep(5000);
        logger.info("Gift Card element is present");
        elementIsPresent(ryanairGiftCardElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inThePlanMenuOptionClickOnOnboardServices() throws InterruptedException {
        logger.info("Click on the plan element");
        Thread.sleep(5000);
        clickOnElement(plan);
        Thread.sleep(5000);
        logger.info("Click on the On Board Service button");
        clickOnElement(onBoardServices);
        Thread.sleep(5000);
        logger.info("On board service element is present");
        elementIsPresent(onBoardServicesElement);
        logger.info("Click <- to go back to home page");
        goBack();
    }

    public void inTheLanguageMenuOptionClickOnAustriaGerman() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Austrian German button");
        clickOnElement(AustriaGerman);
        logger.info("Language has changed");
        elementIsPresent(AustriaGermanElement);
    }

    public void inTheLanguageMenuOptionClickOnBelgiumDutch() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Belgium Dutch button");
        clickOnElement(BelgiumDutch);
        logger.info("Language has changed");
        elementIsPresent(BelgiumDutchElement);
    }

    public void inTheLanguageMenuOptionClickOnBelgiumFrench() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Belgium French button");
        clickOnElement(BelgiumFrench);
        logger.info("Language has changed");
        elementIsPresent(BelgiumFrenchElement);
    }

    public void inTheLanguageMenuOptionClickOnBosniaEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Bosnia English button");
        clickOnElement(BosniaEnglish);
        logger.info("Language has changed");
        elementIsPresent(BosniaEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnBulgariaBulgarian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Bulgaria Bulgarian button");
        clickOnElement(BulgariaBulgarian);
        logger.info("Language has changed");
        elementIsPresent(BulgariaBulgarianElement);
    }

    public void inTheLanguageMenuOptionClickOnChinaChinese() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the China Chinese button");
        clickOnElement(ChinaChinese);
        logger.info("Language has changed");
        elementIsPresent(ChinaChineseElement);
    }

    public void inTheLanguageMenuOptionClickOnCroatiaEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Croatia English button");
        clickOnElement(CroatiaEnglish);
        logger.info("Language has changed");
        elementIsPresent(CroatiaEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnCyprusEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Cyprus English button");
        clickOnElement(CyprusEnglish);
        logger.info("Language has changed");
        elementIsPresent(CyprusEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnCzechRepublicCzech() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Czech Republic Czech button");
        clickOnElement(CzechRepublicCzech);
        logger.info("Language has changed");
        elementIsPresent(CzechRepublicCzechElement);
    }

    public void inTheLanguageMenuOptionClickOnDenmarkDanish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Denmark Danish button");
        clickOnElement(DenmarkDanish);
        logger.info("Language has changed");
        elementIsPresent(DenmarkDanishElement);
    }

    public void inTheLanguageMenuOptionClickOnEstoniaEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Estonia English button");
        clickOnElement(EstoniaEnglish);
        logger.info("Language has changed");
        elementIsPresent(EstoniaEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnFinlandEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Finland English button");
        clickOnElement(FinlandEnglish);
        logger.info("Language has changed");
        elementIsPresent(FinlandEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnFranceFrench() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the France French button");
        clickOnElement(FranceFrench);
        logger.info("Language has changed");
        elementIsPresent(FranceFrenchElement);
    }

    public void inTheLanguageMenuOptionClickOnGermanyGerman() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Germany German button");
        clickOnElement(GermanyGerman);
        logger.info("Language has changed");
        elementIsPresent(GermanyGermanElement);
    }

    public void inTheLanguageMenuOptionClickOnGreatBritainEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Great Britain English button");
        clickOnElement(GreatBritainEnglish);
        logger.info("Language has changed");
        elementIsPresent(GreatBritainEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnGreeceGreek() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Greece Greek button");
        clickOnElement(GreeceGreek);
        logger.info("Language has changed");
        elementIsPresent(GreeceGreekElement);
    }

    public void inTheLanguageMenuOptionClickOnHungaryHungarian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Hungary Hungarian button");
        clickOnElement(HungaryHungarian);
        logger.info("Language has changed");
        elementIsPresent(HungaryHungarianElement);
    }

    public void inTheLanguageMenuOptionClickOnIrelandEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Ireland English button");
        clickOnElement(IrelandEnglish);
        logger.info("Language has changed");
        elementIsPresent(IrelandEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnItalyItalian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Italy Italian button");
        clickOnElement(ItalyItalian);
        logger.info("Language has changed");
        elementIsPresent(ItalyItalianElement);
    }

    public void inTheLanguageMenuOptionClickOnLatviaEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click and the Latvia English button");
        clickOnElement(LatviaEnglish);
        logger.info("Language has changed");
        elementIsPresent(LatviaEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnLatviaLatvian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Latvia Latvian button");
        clickOnElement(LatviaLatvian);
        logger.info("Language has changed");
        elementIsPresent(LatviaLatvianElement);
    }

    public void inTheLanguageMenuOptionClickOnLithuaniaLithuanian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Lithuania Lithuanian button");
        clickOnElement(LithuaniaLithuanian);
        logger.info("Language has changed");
        elementIsPresent(LithuaniaLithuanianElement);
    }

    public void inTheLanguageMenuOptionClickOnLuxembourgFrench() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Luxembourg French button");
        clickOnElement(LuxembourgFrench);
        logger.info("Language has changed");
        elementIsPresent(LuxembourgFrenchElement);
    }

    public void inTheLanguageMenuOptionClickOnMaltaEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Malta English button");
        clickOnElement(MaltaEnglish);
        logger.info("Language has changed");
        elementIsPresent(MaltaEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnMontenegroEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Montenegro English button");
        clickOnElement(MontenegroEnglish);
        logger.info("Language has changed");
        elementIsPresent(MontenegroEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnMoroccoFrench() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Morocco French button");
        clickOnElement(MoroccoFrench);
        logger.info("Language has changed");
        elementIsPresent(MoroccoFrenchElement);
    }

    public void inTheLanguageMenuOptionClickOnNetherlandsDutch() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Netherlands Dutch button");
        clickOnElement(NetherlandsDutch);
        logger.info("Language has changed");
        elementIsPresent(NetherlandsDutchElement);
    }

    public void inTheLanguageMenuOptionClickOnNorwayNorwegian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Norway Norwegian button");
        clickOnElement(NorwayNorwegian);
        logger.info("Language has changed");
        elementIsPresent(NorwayNorwegianElement);
    }

    public void inTheLanguageMenuOptionClickOnPolandPolish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Poland Polish button");
        clickOnElement(PolandPolish);
        logger.info("Language has changed");
        elementIsPresent(PolandPolishElement);
    }

    public void inTheLanguageMenuOptionClickOnPortugalPortuguese() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Portugal Portuguese button");
        clickOnElement(PortugalPortuguese);
        logger.info("Language has changed");
        elementIsPresent(PortugalPortugueseElement);
    }

    public void inTheLanguageMenuOptionClickOnRomaniaRomanian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click in the Romania Romanian button");
        clickOnElement(RomaniaRomanian);
        logger.info("Language has changed");
        elementIsPresent(RomaniaRomanianElement);
    }

    public void inTheLanguageMenuOptionClickOnSerbiaEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Serbia English button");
        clickOnElement(SerbiaEnglish);
        logger.info("Language has changed");
        elementIsPresent(SerbiaEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnSlovakiaEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Slovakia English button");
        clickOnElement(SlovakiaEnglish);
        logger.info("Language has changed");
        elementIsPresent(SlovakiaEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnSpainCatalan() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Spain Catalan button");
        clickOnElement(SpainCatalan);
        logger.info("Language has changed");
        elementIsPresent(SpainCatalanElement);
    }

    public void inTheLanguageMenuOptionClickOnSpainSpanish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Spain Spanish button");
        clickOnElement(SpainSpanish);
        logger.info("Language has changed");
        elementIsPresent(SpainSpanishElement);
    }

    public void inTheLanguageMenuOptionClickOnSwedenSwedish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Sweden Swedish button");
        clickOnElement(SwedenSwedish);
        logger.info("Language has changed");
        elementIsPresent(SwedenSwedishElement);
    }

    public void inTheLanguageMenuOptionClickOnTurkeyEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Turkey English button");
        clickOnElement(TurkeyEnglish);
        logger.info("Language has changed");
        elementIsPresent(TurkeyEnglishElement);
    }

    public void inTheLanguageMenuOptionClickOnUkraineUkrainian() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the Ukraine Ukrainian button");
        clickOnElement(UkraineUkrainian);
        logger.info("Language has changed");
        elementIsPresent(UkraineUkrainianElement);
    }

    public void inTheLanguageMenuOptionClickOnUnitedStatesEnglish() {
        logger.info("Click on the Language button");
        clickOnElement(languageMenu);
        logger.info("Click on the United States English button");
        clickOnElement(UnitedStatesEnglish);
        logger.info("Language has changed");
        elementIsPresent(UnitedStatesEnglishElement);
    }

    public void clickOnLogoForRyanAirInTheUpperLeftCorner() {
        logger.info("Click on the Ryanair logo");
        clickOnElement(logoForRyanAir);
    }

    public void checkTheReturnCheckBox(){
        logger.info("Return check box is present");
        elementIsPresent(returnCheckBox);
        logger.info("Click on the return check box");
        clickOnElement(returnCheckBox);
    }

    public void inTheFromFieldSelectNisInFromOption(){
        logger.info("Open from dropdown menu");
        clickOnElement(fromDropdown);
        logger.info("In the countries select Serbia");
        clickOnElement(clickSerbia);
        logger.info("In the airport list select Nis");
        clickOnElement(clickNis);
    }

    public void inTheToFieldSelectCorfu(){
        logger.info("Select Greece in the destination dropdown menu");
        clickOnElement(clickGreece);
        logger.info("Select Corfu in the airport list");
        clickOnElement(clickCorfu);
    }

    public void selectDatesOfTravel(){
        logger.info("select june 30 as depart day");
        clickOnElement(selectJune30th);
        logger.info("Select July 28 as return day");
        clickOnElement(selectJuly28th);
    }

    public void selectPassengers(){
        logger.info("Check that one adult passenger is preselected");
        elementIsPresent(checkPassenger);
        logger.info("In the passenger dropdown menu select done");
        clickOnElement(buttonDone);
    }

    public void clickSearchButton(){
        logger.info("Click Search button");
        clickOnElement(searchButton);
    }


    //room booking methods
    public void clickHotelsButton() throws InterruptedException {
        logger.info("Click on Hotels button in the menu");
        clickOnElement(HotelsButton);
        Thread.sleep(5000);
    }

    public void inputLondonAsDestination() throws IOException, InterruptedException {
        clearTextBox(destinationTextBox);
        logger.info("In the destination text box input London");
        clickOnElement(destinationTextBox);
        String Town = getFromProperties("Town");
        type(destinationTextBox,Town);
        Thread.sleep(8000);
        logger.info("in the drop down menu select London,United Kingdom");
        scrollIntoViewAndClickItInvisible(London2);
        Thread.sleep(3000);
    }
    public void  selectDatesOfRoomBooking() throws InterruptedException {
        logger.info("Open choose date of travel dropdown menu");
        scrollIntoViewAndClickItInvisible(chooseDateOfTravel);
        Thread.sleep(4000);
        logger.info("Select June 30th as departure day");
        scrollIntoViewAndClickItInvisible(june30);
        Thread.sleep(8000);
        logger.info("Select July 10th as return day");
        scrollIntoViewAndClickItInvisible(july10);
        Thread.sleep(5000);
    }

    public void selectNumberOfRoomOccupants() throws InterruptedException {
        logger.info("Click + sign to add additional passenger");
        Thread.sleep(4000);
        scrollIntoViewAndClickItInvisible(passengerAdd);
        logger.info("Click Done");
        Thread.sleep(3000);
        scrollIntoViewAndClickItInvisible(done);
    }

    public void clickRoomSearchButton() throws InterruptedException {
        logger.info("Click on the search button");
        Thread.sleep(4000);
        clickOnElement(SearchButton);
        Thread.sleep(2000);
    }



    //ticket booking methods

    public void clickEventandActivitiesButton(){
        clickOnElement(clickEvents);
    }



    //car hire methods
    public void clickCarHireButton(){
        clickOnElement(clickCarHire);
    }
}