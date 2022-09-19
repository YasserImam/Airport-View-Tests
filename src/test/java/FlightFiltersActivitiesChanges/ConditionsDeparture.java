package FlightFiltersActivitiesChanges;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionsDeparture extends BaseTest {

//1. Login to tNexus mobile app.
//2. Tap on application menu and tap on Departure Flights.
//3. Tap on filter icon.
//4. Verify if a new filter 'Conditions' is available.
    @Test
    public void checkConditionsExistence() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(5000);
        menuPage.clickFlightOperationsBtn();
        menuPage.clickDepartureFlightsBtn();
        Thread.sleep(5000);
        departurePage.clickFilterBtn();
        Assert.assertTrue(departurePage.conditionsOptionDisplayed());
    }

//1. Login to tNexus mobile app.
//2. Tap on application menu and tap on Departure Flights.
//3. Tap on filter icon and tap on Conditions.
//4. Verify the options available in Conditions filter.
    @Test(dependsOnMethods = "checkConditionsExistence" )
    public void checkConditionsComponents(){
        departurePage.checkConditionsOptions();
    }

    @Test(dependsOnMethods = "checkConditionsComponents")
    public void scheduledFlightsCheck() throws InterruptedException {
        departurePage.scheduledCheck();
        Thread.sleep(5000);
        departurePage.checkAOBT();
    }
}
