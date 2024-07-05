package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class CarHirePage {

    public WebDriver driver;
    public Methods methods;

    public CarHirePage carHirePage(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    //paths
    public By iNeedAcar = By.xpath("//input[@id='input-button__pick-up-location']");
    public By DublinCityCentre = By.xpath("//button[@class='button-no-default-styles car-hire-location__text-wrapper b2' and contains(text(),' Dublin City Centre ')]");
    public By pickUpDate = By.xpath("//div//div[@data-id='2024-06-30']");
    public By pickUpTime = By.xpath("//div[@class='time-selector-item__label' and contains(.,'12:00')]");
    public By dropOffDate = By.xpath("//div//div[@data-id='2024-07-10']");
    public By dropOffTime = By.xpath("//div[@class='time-selector-item__label' and contains(.,'12:30')]");
    public By letsGoButton = By.xpath("//button[@class='car-hire-widget__start-search ry-button--gradient-yellow']");
    public By automatic = By.xpath("//span//div[@class='SM_b8de4613 SM_aa35055d' and contains(.,'Automatic')]");
    public By airConditioning = By.xpath("//div[@class='SM_b8de4613 SM_aa35055d' and contains(.,'Air Conditioning')]");
    public By premiumCar = By.xpath("//div[@class='SM_b8de4613' and contains(.,'Premium car')]");
    public By viewDeal = By.xpath("//div[@class='SM_b8de4613 SM_b4ab3961']");
    public By continueToBookButton = By.xpath("//button[@data-testid='package-deal-cta']");
    public By goToBookWithFullProtection = By.xpath("//button[@data-testid='checkout-cta-with-insurance']");

    public void inputInToINeedACarTextFieldDublin() throws IOException, InterruptedException {
        methods.clearTextBox(iNeedAcar);
        Methods.logger.info("Click on i need a car element");
        methods.clickOnElement(iNeedAcar);
        String CarRentCity = methods.getFromProperties("CarRentCity");
        methods.type(iNeedAcar, CarRentCity);
        Thread.sleep(8000);
        methods.scrollIntoViewAndClickItUnreachableElement(DublinCityCentre,"Dublin,City Centre");
        Thread.sleep(3000);
    }

    public void selectJune30thAsPickUpDate() {
        methods.scrollIntoViewAndClickItUnreachableElement(pickUpDate,"June 30th in the pick up date drop down menu");
    }

    public void selectJuly10thAsDropOffDate() {
        methods.scrollIntoViewAndClickItUnreachableElement(dropOffDate,"July 10th of the drop off drop down menu");
    }

    public void select1200AsPickUpTime() throws InterruptedException {
        methods.scrollIntoViewAndClickItUnreachableElement(pickUpTime,"12:00 in the pick up time drop down menu");
        Thread.sleep(3000);
    }

    public void select1230AsDropOffTime() throws InterruptedException {
        methods.scrollIntoViewAndClickItUnreachableElement(dropOffTime,"12:30 in the drop off drop down menu");
        Thread.sleep(3000);
    }

    public void clickLetsGoButton() {
        methods.scrollIntoViewAndClickItUnreachableElement(letsGoButton,"Lets go button");
    }

    public void underTheTransmissionSelectAutomatic() {
        methods.scrollIntoViewAndClickIt(automatic, "Automatic in the transmission menu");
    }

    public void underTheCarSpecsSelectAirConditioning() {
        methods.scrollIntoViewAndClickIt(airConditioning, "air conditioning in the car specs menu");
    }

    public void selectPremiumCarOption() {
        methods.scrollIntoViewAndClickIt(premiumCar, "Premium car button");
    }

    public void selectTheFirstCarInTheListHire() {
        methods.scrollIntoViewAndClickIt(viewDeal, "first car in the list and click View Deal button");
    }

    public void clickContinueToBookButton() {
        methods.driverSwitch();
        methods.scrollIntoViewAndClickIt(continueToBookButton, "Continue to book button");
    }

    public void clickGoToBookWithFullProtectionButton() {
        methods.scrollIntoViewAndClickIt(goToBookWithFullProtection, "Book with full protection button");
    }
}