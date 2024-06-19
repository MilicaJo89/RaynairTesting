package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelSelectionPage extends Methods {

    public WebDriver driver;

    public HotelSelectionPage hotelSelectionPage (WebDriver driver) {
        this.driver=driver;
        return this;
    }

    //paths
    public By Raffles = By.xpath("//button[@aria-label='More information about Raffles London at The OWO, opens in a new tab']");

    public void clickOnRafflesLondonAtTheOWL() throws InterruptedException {
        Thread.sleep(2000);
        scrollDown();
        Thread.sleep(10000);
        scrollIntoViewAndClickItInvisible(Raffles);
    }








}
