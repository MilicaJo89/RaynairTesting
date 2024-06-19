package Tests;

import Pages.HomePage;
import Pages.TicketSearchPage;
import org.testng.annotations.Test;

public class BookATicketForAnEvent {

    @Test
    public void TicketBooking() throws InterruptedException {
        HomePage homePage = new HomePage();
        TicketSearchPage ticketSearchPage = new TicketSearchPage();

        homePage.siteLoading();
        homePage.clickEventandActivitiesButton();

        ticketSearchPage.clickWhereTo();
        ticketSearchPage.selectIreland();
        ticketSearchPage.selectDublin();
        ticketSearchPage.clickGoButton();
        Thread.sleep(5000);
        ticketSearchPage.selectWhiskeyTastingTour();
        ticketSearchPage.clickDateDropdownMenu();
        ticketSearchPage.selectJune27th();
        Thread.sleep(4000);
        ticketSearchPage.selectNumberOfTickets();
        ticketSearchPage.selectNumberOfTickets();
        ticketSearchPage.clickCheckAvailabilityButton();
        Thread.sleep(3000);
        ticketSearchPage.clickSelectAndCheckoutButton();

    }

}
