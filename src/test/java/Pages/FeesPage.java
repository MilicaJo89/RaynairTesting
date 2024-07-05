package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class FeesPage{

    public WebDriver driver;

    public FeesPage feesPage (WebDriver driver) {
        this.driver=driver;
        return this;
    }

    public Methods methods;

    //paths for flight from nis to corfu
    public By flightFromNisToCorfuSelectButton = By.xpath("//div[@class='flight-card__bumper ng-tns-c2689157688-15']");
    public By flightFromCorfuToNisSelectButton = By.xpath("//div[@class='flight-card__bumper ng-tns-c2689157688-13']");
    public By plusOption = By.xpath("//div[@class='fare-table__fare-column-border fare-table__fare-column-border--sure fare-table__fare-column-border--recommended']");
    public By logInLater = By.xpath("//div//span[@class='login-touchpoint__login-later title-m-lg title-m-sm']");
    public By title = By.xpath("//button[@class='dropdown__toggle body-l-lg body-l-sm']");
    public By chooseMs = By.xpath("//button[@class='dropdown-item__link']//div[@class='dropdown-item__content']//div[contains(.,' Ms ')]");
    public By firstNameTextBox = By.xpath("//div//input[@autocomplete='given-name']");
    public By lastNameTextBox = By.xpath("//div//input[@autocomplete='family-name']");
    public By ContinueButton = By.xpath("//div//button[contains(.,' Continue ')]");
    public By seat17F = By.xpath("//button[@id='seat-17C']");
    public By nextFlightButton = By.xpath("//button[@data-ref='seats-action__button-next']");
    public By continueButton = By.xpath("//button[@class='passenger-carousel__cta passenger-carousel__cta--next ry-button--gradient-yellow']");
    public By sameseatsbutton = By.xpath("//span[@class='_container icon-16']");
    public By anotherseat=By.xpath("//button[@id='seat-17C']");
    public By addfasttrack = By.xpath("//button[@data-ref='enhanced-takeover-beta-desktop__confirm-cta']");
    public By cabinbag = By.xpath("//label[@class='ry-radio-circle-button__label' and @for='ry-radio-button--1']");
    public By continuebagbutton = By.xpath("//button[@class='ry-button--gradient-yellow' and contains(.,' Continue')]");
    public By continueOnBagsButton = By.xpath("//button[@class='airport-and-flight__cta ry-button--gradient-yellow ry-button--large']");
    public By busstoCorfu = By.xpath("//div[@class='transfer-tab__menu-content ng-star-inserted']");
    public By returnCheckBox2 = By.xpath("//label[@class='ry-radio-circle-button__label' and @for='ry-radio-button--1']");
    public By plussign = By.xpath("//div[@class='counter__button-wrapper--enabled']");
    public By clickfrom = By.xpath("//button//span[contains(.,'Choose origin')]");
    public By chooseAirport= By.xpath("//button//div//div[contains(.,' Airport ')]");
    public By chooseCorfu = By.xpath("//div[contains(.,' Corfu / Acharavi / A.GeorgiosSouth / AnalipsiTown / Kommeno ')]");
    public By destinationdrop =By.xpath("//button//span[contains(.,'Choose destination')]");
    public By clickadd = By.xpath("//button[@class='transfer-form__add ry-button--gradient-blue ry-button--medium ng-star-inserted']");
    public By finalcontinue = By.xpath("//button[@class='transport__cta ry-button--gradient-yellow ry-button--large']");

    public void selectFlights(WebDriver driver) throws InterruptedException {
        //select flights
        Thread.sleep(5000);
        Methods.logger.info("Select the flight from Nis to Corfu");
        methods.clickOnElement(flightFromNisToCorfuSelectButton);
        Thread.sleep(3000);
        methods.scrollDown();
        Thread.sleep(2000);
        Methods.logger.info("Select the flight from Corfu to Nis");
        methods.clickOnElement(flightFromCorfuToNisSelectButton);
    }
    public void selectPlusInTheChooseYourFare() throws InterruptedException {
        Methods.logger.info("Click plus option");
        Thread.sleep(3000);
        methods.clickOnElement(plusOption);
        methods.scrollDown();
    }
    public void clickLoginLater() throws InterruptedException {
        Methods.logger.info("Click Login later option");
        methods.clickOnElement(logInLater);
        methods.scrollDown();
        Thread.sleep(3000);
    }
    public void selectMsInTheTitleDropdownMenu() throws InterruptedException {
        Methods.logger.info("Click on title dropdown menu");
        methods.clickOnElement(title);
        Thread.sleep(3000);
        Methods.logger.info("Choose Ms in the dropdown menu");
        methods.clickOnElement(chooseMs);
        Thread.sleep(3000);
    }
    public void inputPassengerInformation() throws InterruptedException, IOException {
        Methods.logger.info("Click on fist name text box");
        methods.clickOnElement(firstNameTextBox);
        Thread.sleep(3000);
        String userFirstName = methods.getFromProperties("FirstName");
        methods.type(firstNameTextBox,userFirstName);
        String userLastName = methods.getFromProperties("LastName");
        methods.type(lastNameTextBox,userLastName);
    }
    public void clickContinueButton(){
        Methods.logger.info("Click Continue button");
        methods.clickOnElement(ContinueButton);
    }
    public void selectSeatsOnFlightFromNisToCorfu() throws InterruptedException {
        Methods.logger.info("Select flight seat 16A");
        methods.clickOnElement(seat17F);
        Thread.sleep(5000);
        Methods.logger.info("Click on the next flight button");
        methods.clickOnElement(nextFlightButton);
        Thread.sleep(5000);
    }
    public void handleSameSeatPopUp() throws InterruptedException {
        Thread.sleep(3000);
        Methods.logger.info("Click on select same seats option");
        methods.clickOnElement(sameseatsbutton);
    }
    public void selectSeatOnFlightFromCorfuToNis() throws InterruptedException {
        Thread.sleep(300);
        methods.scrollDown();
        Methods.logger.info("Click another seat");
        methods.clickOnElement(anotherseat);
    }
    public void clickOnFlightsContinueButton() throws InterruptedException {
        Methods.logger.info("Click continue");
        methods.clickOnElement(continueButton);
        Thread.sleep(8000);
    }
    public void clickAddFastTrack() throws InterruptedException {
        Methods.logger.info("Click add fast track");
        methods.clickOnElement(addfasttrack);
        Thread.sleep(8000);
    }
    public void selectPriorityPlusTwoCabinBags(){
        Methods.logger.info("click cabin bag ");
        methods.clickOnElement(cabinbag);
        methods.scrollDown();
        methods.scrollDown();
        Methods.logger.info("Click continue button");
        methods.clickOnElement(continuebagbutton);
    }
    public void clickBagContinueButton() throws InterruptedException {
        methods.scrollDown();
        methods.scrollDown();
        methods.scrollDown();
        methods.scrollIntoViewAndClickItUnreachableElement(continueOnBagsButton,"Continue button");
    }
    public void arrangeBusInCorfuOption() throws InterruptedException {
        Methods.logger.info("Click on bus to corfu option");
        methods.clickOnElement(busstoCorfu);
        Thread.sleep(5000);
        Methods.logger.info("Check return check box");
        methods.clickOnElement(returnCheckBox2);
        Thread.sleep(5000);
        Methods.logger.info("Click on + sign to add a passenger");
        methods.clickOnElement(plussign);
        Thread.sleep(3000);
        methods.scrollDown();
        Thread.sleep(5000);
        Methods.logger.info("Open from drop down menu");
        methods.clickOnElement(clickfrom);
        Thread.sleep(5000);
        Methods.logger.info("Select Airport option in the drop down menu");
        methods.clickOnElement(chooseAirport);
        Thread.sleep(5000);
        Methods.logger.info("Open destination drop down menu");
        methods.clickOnElement(destinationdrop);
        Thread.sleep(5000);
        Methods.logger.info("Select Corfu option in the drop down menu");
        methods.clickOnElement(chooseCorfu);
        Thread.sleep(5000);
        Methods.logger.info("Click add button");
        methods.clickOnElement(clickadd);
    }
    public void clickOnTransportationContinueButton() throws InterruptedException {
        Thread.sleep(3000);
        Methods.logger.info("Click Continue button");
        methods.clickOnElement(finalcontinue);
    }
}