package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketSearchPage extends Methods {

    public WebDriver driver;

    public TicketSearchPage ticketSearchPage(WebDriver driver) {
        this.driver=driver;
        return this;
    }


    //paths
    public By clickWhereTo = By.xpath("//label[@class='tooltip-selector-box__label']");
    public By Ireland = By.xpath("//button[@class='location-selector__item' and contains(.,'Ireland')]");
    public By Dublin = By.xpath("//button[@class='location-selector__item location-selector__item--overflow-wrap' and contains(.,'Dublin')]");
    public By GoButton = By.xpath("//button[@class='location-searchbar__button']");
    public By WhiskeyTastingTourButton = By.xpath("//img[@title='Whiskey Tasting Tour of Dublin']");
    public By DateDropdownMenu= By.xpath("//div[@class='select-box__trigger form-group__select-trigger']");
    public By June27th = By.xpath("//div[@class='tour-calendar__day-circle' and contains(.,'27')]");
    public By NumberOfTicketsSelector = By.xpath("//img[@src='data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4KPCEtLSBHZW5lcmF0b3I6IEFkb2JlIElsbHVzdHJhdG9yIDIxLjAuMCwgU1ZHIEV4cG9ydCBQbHVnLUluIC4gU1ZHIFZlcnNpb246IDYuMDAgQnVpbGQgMCkgIC0tPgo8c3ZnIHZlcnNpb249IjEuMSIgaWQ9IkxheWVyXzEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgeG1sbnM6eGxpbms9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsiIHg9IjBweCIgeT0iMHB4IgoJIHZpZXdCb3g9IjAgMCAyNiAyNiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgMjYgMjY7IiB4bWw6c3BhY2U9InByZXNlcnZlIj4KPHN0eWxlIHR5cGU9InRleHQvY3NzIj4KCS5zdDB7Y2xpcC1wYXRoOnVybCgjU1ZHSURfMl8pO2ZpbGw6IzIwOTFFQjt9Cgkuc3Qxe2ZpbGw6IzIwOTFFQjt9Cjwvc3R5bGU+CjxnPgoJPGRlZnM+CgkJPHJlY3QgaWQ9IlNWR0lEXzFfIiB4PSIwLjIiIHk9IjAuMiIgd2lkdGg9IjI1LjYiIGhlaWdodD0iMjUuNiIvPgoJPC9kZWZzPgoJPGNsaXBQYXRoIGlkPSJTVkdJRF8yXyI+CgkJPHVzZSB4bGluazpocmVmPSIjU1ZHSURfMV8iICBzdHlsZT0ib3ZlcmZsb3c6dmlzaWJsZTsiLz4KCTwvY2xpcFBhdGg+Cgk8cGF0aCBjbGFzcz0ic3QwIiBkPSJNMTMsMjUuOEM2LDI1LjgsMC4yLDIwLDAuMiwxM0MwLjIsNiw2LDAuMiwxMywwLjJTMjUuOCw2LDI1LjgsMTNDMjUuOCwyMCwyMCwyNS44LDEzLDI1Ljh6IE0xMywyCgkJQzYuOSwyLDIsNi45LDIsMTNjMCw2LjEsNC45LDExLDExLDExYzYuMSwwLDExLTQuOSwxMS0xMUMyNCw2LjksMTkuMSwyLDEzLDJ6Ii8+CjwvZz4KPHBhdGggY2xhc3M9InN0MSIgZD0iTTIwLjEsMTMuOUg1LjlDNS40LDEzLjksNSwxMy41LDUsMTNzMC40LTAuOSwwLjktMC45aDE0LjNjMC41LDAsMC45LDAuNCwwLjksMC45UzIwLjYsMTMuOSwyMC4xLDEzLjl6Ii8+CjxwYXRoIGNsYXNzPSJzdDEiIGQ9Ik0xMywyMWMtMC41LDAtMC45LTAuNC0wLjktMC45VjUuOUMxMi4xLDUuNCwxMi41LDUsMTMsNXMwLjksMC40LDAuOSwwLjl2MTQuM0MxMy45LDIwLjYsMTMuNSwyMSwxMywyMXoiLz4KPC9zdmc+Cg==']");
    public By CheckAvailabilityButton = By.xpath("//button[@class='tour-page__update-selection-button']");
    public By selectAndCheckoutButton = By.xpath("//button[@class='tour-option__checkout-button']");

    public void clickWhereTo(){
        driverSwitch();
        clickOnElement(clickWhereTo);
    }

    public void selectIreland(){
        clickOnElement(Ireland);
    }

    public void selectDublin(){
        clickOnElement(Dublin);
    }

    public void clickGoButton(){
        clickOnElement(GoButton);
    }

    public void selectWhiskeyTastingTour(){
        scrollIntoViewAndClickIt(WhiskeyTastingTourButton);
    }

    public void clickDateDropdownMenu(){
        clickOnElement(DateDropdownMenu);
    }

    public void selectJune27th(){
        clickOnElement(June27th);
    }

    public void selectTwoTickets(){
        scrollIntoViewAndClickIt(NumberOfTicketsSelector);
        scrollIntoViewAndClickIt(NumberOfTicketsSelector);
    }

    public void clickCheckAvailabilityButton(){
        clickOnElement(CheckAvailabilityButton);
    }

    public void clickSelectAndCheckoutButton(){
        clickOnElement(selectAndCheckoutButton);
    }

}
