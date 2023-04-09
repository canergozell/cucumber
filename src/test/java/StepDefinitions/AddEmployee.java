package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {
    @When("user clicks in PIM option")
    public void user_clicks_in_pim_option() {
        // driver.findElement(By.id("menu_pim_viewPimModule")).click();
        WebElement pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
        doClick(pimTab);


    }
    @When("user click on add employee button")
    public void user_click_on_add_employee_button() {
        WebElement eddEmpBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        doClick(eddEmpBtn);

    }
    @When("user enters firstname and middle name and  lastname")
    public void user_enters_firstname_and_middle_name_and_lastname() {

        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
        sendText(firstNameTextBox, ConfigReader.getPropertyValue("firstName"));



        WebElement middleNameTextBox = driver.findElement(By.id("middleName"));
        sendText(middleNameTextBox, ConfigReader.getPropertyValue("middleName"));


        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        sendText(lastNameTextBox, ConfigReader.getPropertyValue("lastName"));
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveBtn = driver.findElement(By.id("btnSave"));
        doClick(saveBtn);

    }
}
