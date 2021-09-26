package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.SeleniumUtils;


public class HomeSteps {
    HomeImpl impl = new HomeImpl();

    @When("I open Home page I should see {int} items on the page")
    public void i_open_home_page_i_should_see_items_on_the_page(Integer int1) {
        Assert.assertEquals(6, impl.getPage().items.size());
    }

    @When("I click Add to Cart button toggle should change Remove")
    public void i_click_add_to_cart_button_toggle_should_change_remove() {
        impl.getPage().addBtn.click();
        Assert.assertTrue(impl.getPage().removeBtn.isDisplayed());
    }

    @When("I click {string} button")
    public void iClickButton(String buttonName) {
        impl.iClickOnButton(buttonName);
    }

    @Then("Title of the page should contain {string}")
    public void titleOfThePageShouldContain(String text) {
        Assert.assertTrue(SeleniumUtils.switchToNextWindowGetTitle().contains(text));
    }
}
