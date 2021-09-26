package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.awt.*;
import java.util.concurrent.TimeUnit;

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


    @Then("Title of the page should be Twitter")
    public void title_of_the_page_should_be_twitter() throws InterruptedException {
//          Assert.assertEquals("Sauce Labs (@saucelabs) / Twitter", SeleniumUtils.switchToNextWindowGetTitle());
        Assert.assertTrue(SeleniumUtils.switchToNextWindowGetTitle().contains("Twitter"));
    }

    @Then("Title of the page should be Sauce Labs | Facebook")
    public void title_of_the_page_should_be_sauce_labs_facebook() {
//        Assert.assertEquals("Sauce Labs - Home | Facebook", SeleniumUtils.switchToNextWindowGetTitle());
        Assert.assertTrue(SeleniumUtils.switchToNextWindowGetTitle().contains("Facebook"));
    }

    @Then("Title of the page should be Sign In | LinkedIn")
    public void title_of_the_page_should_be_sign_in_linked_in() {
//        Assert.assertEquals("Sign In | LinkedIn", SeleniumUtils.switchToNextWindowGetTitle());
        Assert.assertTrue(SeleniumUtils.switchToNextWindowGetTitle().contains("LinkedIn"));
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
