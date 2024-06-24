package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RafflesPage extends Methods {

    public WebDriver driver;

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
        driverSwitch();
        Thread.sleep(3000);
        scrollDown();
        scrollIntoViewAndClickItInvisible(ConnorSuite);
        Thread.sleep(3000);
        Thread.sleep(3000);
        scrollIntoViewAndClickItInvisible(breakfast);
        Thread.sleep(3000);
        scrollIntoViewAndClickItInvisible(reserve);
    }

    public void clickAcceptAllCookies(){
        clickOnElement(AcceptAllCookies);
    }








}
