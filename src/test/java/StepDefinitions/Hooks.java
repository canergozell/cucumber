package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {


    @Before
    public void preConditions() {
        openBrowserAndLaunchApplications();
    }

    @After
    public void postConditions() {
        closeBrowser();
    }
}
