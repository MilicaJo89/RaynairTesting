package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CarHirePage extends Methods {

    public WebDriver driver;

    public CarHirePage carHirePage (WebDriver driver) {
        this.driver=driver;
        return this;
    }


    //paths
    public By iNeedAcar = By.xpath("//input[@id='input-button__pick-up-location']");
    public By DublinCityCentre = By.xpath("//button[@class='button-no-default-styles car-hire-location__text-wrapper b2' and contains(text(),' Dublin City Centre ')]");
    public By pickUpDate = By.xpath("//div//div[@data-id='2024-06-30']");
    public By pickUpTime= By.xpath("//div[@class='time-selector-item__label' and contains(.,'12:00')]");
    public By dropOffDate = By.xpath("//div//div[@data-id='2024-07-10']");
    public By dropOffTime = By.xpath("//div[@class='time-selector-item__label' and contains(.,'12:30')]");
    public By letsGoButton = By.xpath("//button[@class='car-hire-widget__start-search ry-button--gradient-yellow']");
    public By automatic = By.xpath("//span//div[@class='SM_b8de4613 SM_aa35055d' and contains(.,'Automatic')]");
    public By airConditioning = By.xpath("//div[@class='SM_b8de4613 SM_aa35055d' and contains(.,'Air Conditioning')]");
    public By premiumCar = By.xpath("//div[@class='SM_b8de4613' and contains(.,'Premium car')]");
    public By mercedesCClass = By.xpath("//h2//div[contains(text(),'Mercedes C-Class')]");
    public By viewDeal = By.xpath("//div[@class='SM_b8de4613 SM_b4ab3961']");
    public By continueToBookButton = By.xpath("//button[@data-testid='package-deal-cta']");
    public By goToBookWithFullProtection = By.xpath("//button[@data-testid='checkout-cta-with-insurance']");


    public void inputInToINeedACarTextFieldDublin() throws IOException, InterruptedException {
        logger.info("In the i need a car text box input Dublin");
        clearTextBox(iNeedAcar);
        clickOnElement(iNeedAcar);
        String CarRentCity = getFromProperties("CarRentCity");
        type(iNeedAcar,CarRentCity);
        Thread.sleep(8000);
        logger.info("in the drop down menu select Dublin,City Centre");
        scrollIntoViewAndClickItInvisible(DublinCityCentre);
        Thread.sleep(3000);
    }

    public void selectJune30thAsPickUpDate(){
        logger.info("In the pick up date drop down menu select June 30th");
        scrollIntoViewAndClickItInvisible(pickUpDate);
    }

    public void selectJuly10thAsDropOffDate(){
        logger.info("In the drop off drop down menu select July 10th");
        scrollIntoViewAndClickItInvisible(dropOffDate);
    }

    public void select1200AsPickUpTime() throws InterruptedException {
        logger.info("In the pick up time drop down menu select 12:00");
        scrollIntoViewAndClickItInvisible(pickUpTime);
        Thread.sleep(3000);
    }

    public void select1230AsDropOffTime() throws InterruptedException {
        logger.info("In the drop off drop down menu select 12:30");
        scrollIntoViewAndClickItInvisible(dropOffTime);
        Thread.sleep(3000);
    }

    public void clickLetsGoButton(){
        logger.info("Click Lets go button");
        scrollIntoViewAndClickItInvisible(letsGoButton);
    }

    public void underTheTransmissionSelectAutomatic(){
        logger.info("Select Automatic in the transmission menu");
        scrollIntoViewAndClickIt(automatic);
    }

    public void underTheCarSpecsSelectAirConditioning(){
        scrollIntoViewAndClickIt(airConditioning);
    }

    public void selectPremiumCarOption(){
        scrollIntoViewAndClickIt(premiumCar);
    }

    public void selectTheFirstCarInTheListHire(){
        scrollIntoViewAndClickIt(viewDeal);
    }

    public void clickContinueToBookButton(){
        driverSwitch();
        scrollIntoViewAndClickIt(continueToBookButton);
    }

    public void clickGoToBookWithFullProtectionButton(){
        scrollIntoViewAndClickIt(goToBookWithFullProtection);
    }


}


