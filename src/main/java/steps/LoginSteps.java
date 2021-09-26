package steps;

import impl.LoginImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();

    @Given("I navigate to LoginPage")
    public void i_navigate_to_login_page() {
      impl.navigateToLoginPage();
    }
    @When("I input {string} as {string}")
    public void i_input_as(String inputFieldName, String value) {
       impl.fillInputField(inputFieldName, value);
    }
    @When("I click Login button")
    public void i_click_login_button() {
       impl.getPage().loginBtn.click();
    }
    @Then("Title of the page should be Swag Labs")
    public void title_of_the_page_should_be_swag_labs() {
        Assert.assertEquals("Swag Labs", WebDriverUtils.getDriver().getTitle());
    }
}
