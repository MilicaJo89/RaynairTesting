package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelSelectionPage{

    public WebDriver driver;
    public Methods methods;

    public HotelSelectionPage hotelSelectionPage (WebDriver driver) {
        this.driver=driver;
        return this;
    }

    //paths
    public By Raffles = By.xpath("//button[@aria-label='More information about Raffles London at The OWO, opens in a new tab']");

    public void clickOnRafflesLondonAtTheOWL() throws InterruptedException {
        Thread.sleep(2000);
        methods.scrollDown();
        Thread.sleep(2000);
        methods.scrollDown();
        Thread.sleep(3000);
        methods.scrollDown();
        Thread.sleep(10000);
        methods.scrollIntoViewAndClickItUnreachableElement(Raffles,"Raffles At The OWL hotel");
    }
}