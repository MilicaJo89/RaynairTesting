package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RafflesPage{

    public WebDriver driver;
    public Methods methods;

    public RafflesPage rafflesPage (WebDriver driver) {
        this.driver=driver;
        return this;
    }

    //paths
    public By ConnorSuite = By.xpath("//button[@aria-label='View all photos for Suite, Corner']");
    public By breakfast = By.xpath("//label[@for='dialog-7-extras-1']");
    public By reserve = By.xpath("//span[contains(.,'Reserve')]");
    public By AcceptAllCookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");

    public void selectConnorSuiteAndAddBreakfastInExtras() throws InterruptedException {
        methods.driverSwitch();
        Thread.sleep(3000);
        methods.scrollDown();
        methods.scrollIntoViewAndClickItUnreachableElement(ConnorSuite,"Connor Suite");
        Thread.sleep(5000);
        methods.scrollIntoViewAndClickItUnreachableElement(breakfast,"breakfast in the extras in the Connor suite reservation pop up window");
        Thread.sleep(3000);
        methods.scrollIntoViewAndClickItUnreachableElement(reserve,"Reserve button");
    }
    public void clickAcceptAllCookies(){
        Methods.logger.info("Click Accept all cookies button");
        methods.clickOnElement(AcceptAllCookies);
    }
}