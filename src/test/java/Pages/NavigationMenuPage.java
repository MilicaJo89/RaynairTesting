package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationMenuPage {

    public By logoForRyanAir = By.xpath("//div[@class='common-header__logo']");
    public By clickHelp = By.xpath("//span[@class='ng-star-inserted' and contains(.,'Help ')]");
    public By myBooking = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor']");
    public By signUp = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor' and contains(.,' Sign up')]");
    public By xMarksTheSpot = By.xpath("//button//icon[@iconid='glyphs/close-takeover']");
    public By logIn = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor' and contains(.,' Log in')]");
    public By query = By.xpath("//input[@id='query']");
    public By emailElement = By.xpath("//div[@class='titles']");
    public By signInElement = By.xpath("//input[@class='body-l-lg body-l-sm date-placeholder invisible-background']");


    WebDriver driver;
    Methods methods = new Methods();

    public NavigationMenuPage navigationMenuPage(WebDriver driver) {
        this.driver=driver;
        return this;
    }
    public void clickOnLogoForRyanAirInTheUpperLeftCorner() {
        Methods.logger.info("Click on the Ryanair logo");
        methods.clickOnElement(logoForRyanAir);
        new NavigationMenuPage();
    }

    public void clickHelpButton() throws InterruptedException {
        Methods.logger.info("Click Help");
        methods.clickOnElement(clickHelp);
        Thread.sleep(3000);
        methods.driverSwitch();
        methods.elementIsPresent(query,"Help page element ");
        methods.driverSwitchBack();
        methods.closeTab();
    }

    public void clickOnMyBooking() throws InterruptedException {
        Methods.logger.info("Click on the myBooking element");
        methods.clickOnElement(myBooking);
        Thread.sleep(5000);
        methods.elementIsPresent(emailElement,"MyBooking element ");
        methods.goBack();
    }

    public void clickOnSignUpButton() throws InterruptedException {
        Methods.logger.info("Click sign up element");
        methods.clickOnElement(signUp);
        methods.elementIsPresent(signInElement,"Sign in element");
        Thread.sleep(3000);
        Methods.logger.info("Click X to close the pop up window");
        methods.clickOnElement(xMarksTheSpot);
    }

    public void clickOnLoginButton() throws InterruptedException {
        Methods.logger.info("Click Login button");
        methods.clickOnElement(logIn);
        methods.elementIsPresent(signInElement,"Login element");
        Thread.sleep(3000);
        Methods.logger.info("Click X to close the pop up window");
        methods.clickOnElement(xMarksTheSpot);
    }


}



