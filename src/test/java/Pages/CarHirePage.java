package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CarHirePage extends Methods {

    public WebDriver driver;

    public CarHirePage carHirePage (WebDriver driver) {
        this.driver=driver;
        return this;
    }


    //paths
    public By iNeedAcar = By.xpath("//input[@id='input-button__pick-up-location']");
    public By DublinCityCentre = By.xpath("//button[@class='button-no-default-styles car-hire-location__text-wrapper b2']");
    public By pickUpDate = By.xpath("//");
    public By pickUpTime= By.xpath("//");
    public By dropOffDate = By.xpath("//");
    public By dropOffTime = By.xpath("//");
    public By letsGoButton = By.xpath("//");

    public void inputInToINeedACarTextFieldDublin() throws IOException, InterruptedException {
        logger.info("In the i need a car text box input Dublin");
        clearTextBox(iNeedAcar);
        clickOnElement(iNeedAcar);
        String CarRentCity = getFromProperties("CarRentCity");
        type(iNeedAcar,CarRentCity);
        Thread.sleep(8000);
        logger.info("in the drop down menu select London,United Kingdom");
        scrollIntoViewAndClickItInvisible(DublinCityCentre);
        Thread.sleep(3000);
    }






}
