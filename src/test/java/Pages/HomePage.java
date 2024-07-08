package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class HomePage {

    public WebDriver driver;
    private Methods methods = new Methods();

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
    public By YesIAgree = By.xpath("//button[@class='cookie-popup-with-overlay__button-settings']");
    public By AllowAll = By.xpath("//button[@class='cookies-details__allow-all-button ry-button--gradient-blue ng-star-inserted']");
    public By Done = By.xpath("//button[@class='cookies-details__done-button ry-button--gradient-yellow ng-star-inserted']");
    public By specialAsistance = By.xpath("//a[@aria-label='Assistance']");
    public By plan = By.xpath("//span[contains(.,'Plan ')]");
    public By fareFinder = By.xpath("//a[@aria-label='Fare Finder']");
    public By cheapFlightsTitle = By.xpath("//h1[@class='row-fares-search-title']");
    public By privacyButtonHomePage = By.xpath("//button[@class='cookie-popup-with-overlay__button-settings']");
    public By RouteMap = By.xpath("//a[@aria-label='Route map']");
    public By routeElement = By.xpath("//div[@class='searchbox-label-departures']");
    public By Destination = By.xpath("//a[@aria-label='Destinations']");
    public By DestinationElement = By.xpath("//h1[@class='seo-hero-image-title']");
    public By Timetable = By.xpath("//a[@aria-label='Timetable']");
    public By timetableElement = By.xpath("//h1[@class='timetable-header title-xl-lg']");
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
    //paths for room booking
    public By HotelsButton = By.xpath("//div[@class='tab-text ng-star-inserted' and contains(.,'hotels')]");
    public By destinationTextBox = By.xpath("//input[@id='input-button__locations-or-properties']");
    public By London2 = By.xpath("//div[@data-ref='location-item__name' and contains(.,'London, England')]");
    public By chooseDateOfTravel = By.xpath("//div[@data-ref='input-button__display-value']");
    public By june30 = By.xpath("//div[@data-id='2024-07-30']");
    public By july10 = By.xpath("//div[@data-id='2024-08-10']");
    public By passengerAdd = By.xpath("//div[@data-ref='counter.counter__increment']");
    public By done = By.xpath("//button[@class='rooms_done-button ry-button--anchor-blue ry-button--anchor']");
    public By SearchButton = By.xpath("//button[@class='rooms-search-widget__start-search ry-button--gradient-yellow']");
    //paths for event booking
    public By clickEvents= By.xpath("//div[@class='tab-text ng-star-inserted' and contains(.,'Events & Activities')]");
    //paths for car hire
    public By clickCarHire = By.xpath("//div[@class='tab-text ng-star-inserted' and contains(.,'Car Hire')]");

    public void siteLoading() throws InterruptedException {
        Methods.logger.info("Site opens");
        methods.setUp();
        Thread.sleep(5000);
        Methods.logger.info("Pop up appears and click button Yes,I Agree");
        methods.clickOnElement(YesIAgree);
        Thread.sleep(5000);
        methods.scrollIntoViewAndClick(AllowAll,"allow all in the cookies privacy pop up");
        Thread.sleep(5000);
        methods.scrollIntoViewAndClick(Done,"Done button in the cookies privacy pop up");
    }



    public void clickSpecialAssistance() throws InterruptedException {
        Methods.logger.info("Click on the Special Assistance element");
        methods.clickOnElement(specialAsistance);
        Thread.sleep(5000);
        methods.driverSwitch();
        methods.checkUrlLink();
        methods.driverSwitchBack();
        methods.closeTab();
        Thread.sleep(5000);
    }
    public void inThePlanMenuOptionClickOnFareFinder() throws InterruptedException {
        Thread.sleep(3000);
        Methods.logger.info("Click on the plan element");
        methods.clickOnElement(plan);
        Thread.sleep(3000);
        Methods.logger.info("Click on FareFinder");
        methods.clickOnElement(fareFinder);
        Thread.sleep(5000);
        methods.elementIsPresent(cheapFlightsTitle,"Fare finder element");
        Thread.sleep(3000);
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnRouteMap() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        methods.clickOnElement(plan);
        Thread.sleep(3000);
        Methods.logger.info("Click on Route map element");
        methods.clickOnElement(RouteMap);
        Thread.sleep(5000);
        methods.elementIsPresent(routeElement,"Route Map element");
        Thread.sleep(4000);
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnDestinations() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on Destination button");
        methods.clickOnElement(Destination);
        Thread.sleep(5000);
        methods.elementIsPresent(DestinationElement,"Destinations element ");
        Thread.sleep(4000);
        methods.goBack();
        Thread.sleep(4000);
    }

    public void inThePlanMenuOptionClickOnTimetable(WebDriver driver) throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Timetable button");
        methods.clickOnElement(Timetable);
        Thread.sleep(7000);
        methods.elementIsPresent(timetableElement,"Timetable element ");
        methods.goBack();
        Thread.sleep(5000);
    }

    public void inThePlanMenuOptionClickOnTrySomewhereNew() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on Try Something New button");
        methods.clickOnElement(TrySomethingNew);
        Thread.sleep(5000);
        Methods.logger.info("Click Try Something New privacy button");
        methods.clickOnElement(somethingPrivacy);
        Thread.sleep(5000);
        methods.elementIsPresent(somethingElement,"Try something new element ");
        methods.goBack();
        Thread.sleep(5000);
        Methods.logger.info("Click on the Home page privacy button");
        methods.clickOnElement(privacyButtonHomePage);
        Thread.sleep(5000);
        methods.scrollIntoViewAndClick(AllowAll, "Allow all button in the cookie privacy pop up");
        Thread.sleep(5000);
        methods.scrollIntoViewAndClick(Done,"Done button in the cookies privacy pop up");
    }

    public void inThePlanMenuOptionClickGroupTravel() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Group Travel button");
        methods.clickOnElement(GroupTravel);
        Thread.sleep(5000);
        methods.elementIsPresent(GroupTravelElement,"Group travel element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnTheOnlineTravelPirateScams() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Online Travel Pirate Scams button");
        methods.clickOnElement(OnlinePirate);
        Thread.sleep(5000);
        methods.elementIsPresent(OnlinePirateElement,"Online Travel Pirate Scams element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickCustomerTestimonials() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on Testimonials element");
        methods.clickOnElement(Testimonials);
        Thread.sleep(5000);
        methods.elementIsPresent(TestimonialsElement,"Testimonials element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickFlightEssentials() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on Flight Essentials button");
        methods.clickOnElement(flightEssentials);
        Thread.sleep(5000);
        methods.elementIsPresent(flightEssentialsElement,"Flight Essentials element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnFareBundles() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on Fare Bundles button");
        methods.clickOnElement(fareBundles);
        Thread.sleep(5000);
        methods.elementIsPresent(fareBundlesElement,"Fare Bundle element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnSearchCarHire() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Search Cars button");
        methods.clickOnElement(searchCars);
        Thread.sleep(5000);
        methods.elementIsPresent(searchCarsElement,"Search Car Hire element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnSearchRooms() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Search Rooms button");
        methods.clickOnElement(searchRooms);
        Thread.sleep(5000);
        methods.elementIsPresent(searchRoomsElement,"Search Room element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnSearchEventsAndActivities() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on Search Events And Activities button");
        methods.clickOnElement(searchEvents);
        Thread.sleep(5000);
        methods.elementIsPresent(searchEventsElement,"Search Events And Activities element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnSearchParking() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Search Parking button");
        methods.clickOnElement(searchParking);
        Thread.sleep(5000);
        methods.elementIsPresent(searchParkingElement,"Search Parking element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnSearchPrivateTransfers() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Search Private Transfers button");
        methods.clickOnElement(privateTransfers);
        Thread.sleep(5000);
        methods.elementIsPresent(privateTransfersElement,"Search Private Transfers element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnSearchBusAndTrains() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Search Bus and Train button");
        methods.clickOnElement(busAndTrain);
        Thread.sleep(5000);
        methods.elementIsPresent(busAndTrainElement,"Search Bus and Train element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnRyanairGiftCards() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the Ryanair Gift Card button");
        methods.clickOnElement(ryanairGiftCard);
        Thread.sleep(5000);
        methods.elementIsPresent(ryanairGiftCardElement,"Ryanair GiftCards element ");
        methods.goBack();
    }

    public void inThePlanMenuOptionClickOnOnboardServices() throws InterruptedException {
        Methods.logger.info("Click on the plan element");
        Thread.sleep(5000);
        methods.clickOnElement(plan);
        Thread.sleep(5000);
        Methods.logger.info("Click on the On Board Service button");
        methods.clickOnElement(onBoardServices);
        Thread.sleep(5000);
        methods.elementIsPresent(onBoardServicesElement,"On board service element ");
        methods.goBack();
    }

    public void inTheLanguageMenuOption(String Language) {
        switch (Language){
            //case "": changelang();
            case "austria":changelang(AustriaGerman,AustriaGermanElement,"Austria(German)");break;
            case "belgium dutch":changelang(BelgiumDutch,BelgiumDutchElement,"Belgium(Dutch)");break;
            case "belgium french":changelang(BelgiumFrench,BelgiumFrenchElement,"Belgium(French)");break;
            case "bosnia":changelang(BosniaEnglish,BosniaEnglishElement,"Bosnia(English)");break;
            case "bulgaria":changelang(BulgariaBulgarian,BulgariaBulgarianElement,"Bulgaria(Bulgarian)");break;
            case "china":changelang(ChinaChinese,ChinaChineseElement,"China(Chinese)");break;
            case "croatia":changelang(CroatiaEnglish,CroatiaEnglishElement,"Croatia(English)");break;
            case "cyprus":changelang(CyprusEnglish,CyprusEnglishElement,"Cyprus(English)");break;
            case "czech":changelang(CzechRepublicCzech,CzechRepublicCzechElement,"Czech Republic(Czech)");break;
            case "denmark":changelang(DenmarkDanish,DenmarkDanishElement,"Denmark(Danish)");break;
            case "estonia":changelang(EstoniaEnglish,EstoniaEnglishElement,"Estonia(English)");break;
            case "finland":changelang(FinlandEnglish,FinlandEnglishElement,"Finland(English)");break;
            case "france":changelang(FranceFrench,FranceFrenchElement,"France(French)");break;
            case "germany":changelang(GermanyGerman,GermanyGermanElement,"Germany(German)");break;
            case "great britain":changelang(GreatBritainEnglish,GreatBritainEnglishElement,"Great Britain(English)");break;
            case "greece":changelang(GreeceGreek,GreeceGreekElement,"Greece(Greek)");break;
            case "hungary":changelang(HungaryHungarian,HungaryHungarianElement,"Hungary(Hungarian)");break;
            case "ireland":changelang(IrelandEnglish,IrelandEnglishElement,"Ireland(English)");break;
            case "italy": changelang(ItalyItalian,ItalyItalianElement,"Italy(Italian)");break;
            case "latvia english":changelang(LatviaEnglish,LatviaEnglishElement,"Latvia(English)");break;
            case "latvia latvian":changelang(LatviaLatvian,LatviaLatvianElement,"Latvia(Latvian)");break;
            case "lithuania":changelang(LithuaniaLithuanian,LithuaniaLithuanianElement,"Lithuania(Lithuanian)");break;
            case "luxembourg":changelang(LuxembourgFrench,LuxembourgFrenchElement,"Luxembourg(French)");break;
            case "malta":changelang(MaltaEnglish,MaltaEnglishElement,"Malta(English)");break;
            case "montenegro":changelang(MontenegroEnglish,MontenegroEnglishElement,"Montenegro(English)");break;
            case "morocco":changelang(MoroccoFrench,MoroccoFrenchElement,"Morocco(French)");break;
            case "netherlands":changelang(NetherlandsDutch,NetherlandsDutchElement,"Netherlands(Dutch)");break;
            case "norway":changelang(NorwayNorwegian,NorwayNorwegianElement,"Norway(Norwegian)");break;
            case "poland":changelang(PolandPolish,PolandPolishElement,"Poland(Polish)");break;
            case "portugal":changelang(PortugalPortuguese,PortugalPortugueseElement,"Portugal(Portuguese)");break;
            case "romania":changelang(RomaniaRomanian,RomaniaRomanianElement,"Romania(Romanian)");break;
            case "serbia":changelang(SerbiaEnglish,SerbiaEnglishElement,"Serbia(English)");break;
            case "slovakia":changelang(SlovakiaEnglish,SlovakiaEnglishElement,"Slovakia(English)");break;
            case "spain catalan":changelang(SpainCatalan,SpainCatalanElement,"Spain(Catalan)");break;
            case "spain spanish":changelang(SpainSpanish,SpainSpanishElement,"Spain(Spanish)");break;
            case "sweden":changelang(SwedenSwedish,SwedenSwedishElement,"Sweden(Swedish)");break;
            case "turkey":changelang(TurkeyEnglish,TurkeyEnglishElement,"Turkey(English)");break;
            case "ukraine":changelang(UkraineUkrainian,UkraineUkrainianElement,"Ukraine(Ukrainian)");break;
            case "united states": changelang(UnitedStatesEnglish,UnitedStatesEnglishElement,"United States(English)");break;
        }
    }
    public void changelang(By language, By laguageConfirmation, String text){
        Methods.logger.info("Click on the Language button");
        methods.clickOnElement(languageMenu);
        Methods.logger.info("Click on the "+text+ "button");
        methods.clickOnElement(language);
        methods.elementIsPresent(laguageConfirmation, "Element has changed language and it ");
    }


    public void checkTheReturnCheckBox(){
        methods.elementIsPresent(returnCheckBox,"Return check box element");
        Methods.logger.info("Click on the return check box");
        methods.clickOnElement(returnCheckBox);
    }

    public void inTheFromFieldSelectNisInFromOption(){
        Methods.logger.info("Open from dropdown menu");
        methods.clickOnElement(fromDropdown);
        Methods.logger.info("In the countries select Serbia");
        methods.clickOnElement(clickSerbia);
        Methods.logger.info("In the airport list select Nis");
        methods.clickOnElement(clickNis);
    }

    public void inTheToFieldSelectCorfu(){
        Methods.logger.info("Select Greece in the destination dropdown menu");
        methods.clickOnElement(clickGreece);
        Methods.logger.info("Select Corfu in the airport list");
        methods.clickOnElement(clickCorfu);
    }

    public void selectDatesOfTravel(){
        Methods.logger.info("select june 30 as depart day");
        methods.clickOnElement(selectJune30th);
        Methods.logger.info("Select July 28 as return day");
        methods.clickOnElement(selectJuly28th);
    }

    public void selectPassengers(){
        methods.elementIsPresent(checkPassenger,"One adult passenger element is preselected and it ");
        Methods.logger.info("In the passenger dropdown menu select done");
        methods.clickOnElement(buttonDone);
    }

    public void clickSearchButton(){
        Methods.logger.info("Click Search button");
        methods.clickOnElement(searchButton);
    }
    //room booking methods
    public void clickHotelsButton() throws InterruptedException {
        Methods.logger.info("Click on Hotels button in the menu");
        methods.clickOnElement(HotelsButton);
        Thread.sleep(5000);
    }
    public void inputLondonAsDestination() throws IOException, InterruptedException {
        methods.clearTextBox(destinationTextBox);
        Methods.logger.info("Click on the destination text box element");
        methods.clickOnElement(destinationTextBox);
        String Town = methods.getFromProperties("Town");
        methods.type(destinationTextBox,Town);
        Thread.sleep(8000);
        methods.scrollIntoViewAndClickItUnreachableElement(London2,"London,United Kingdom");
        Thread.sleep(3000);
    }
    public void  selectDatesOfRoomBooking() throws InterruptedException {
        methods.scrollIntoViewAndClickItUnreachableElement(chooseDateOfTravel,"choose date of travel dropdown menu");
        Thread.sleep(4000);
        methods.scrollIntoViewAndClickItUnreachableElement(june30,"June 30th as departure day");
        Thread.sleep(8000);
        methods.scrollIntoViewAndClickItUnreachableElement(july10,"July 10th as return day");
        Thread.sleep(5000);
    }
    public void selectNumberOfRoomOccupants() throws InterruptedException {
        Thread.sleep(4000);
        methods.scrollIntoViewAndClickItUnreachableElement(passengerAdd,"+ sign to add additional passenger");
        Thread.sleep(3000);
        methods.scrollIntoViewAndClickItUnreachableElement(done,"Done button");
    }
    public void clickRoomSearchButton() throws InterruptedException {
        Methods.logger.info("Click on the search button");
        Thread.sleep(4000);
        methods.clickOnElement(SearchButton);
        Thread.sleep(2000);
    }
    //ticket booking methods
    public void clickEventandActivitiesButton(){
        Methods.logger.info("Click on Event and Activities button");
        methods.clickOnElement(clickEvents);
    }
    //car hire methods
    public void clickCarHireButton(){
        Methods.logger.info("Click on the Car Hire button");
        methods.clickOnElement(clickCarHire);
    }
}