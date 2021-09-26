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

    @When("I click Twitter button")
    public void i_click_twitter_button() throws InterruptedException {
        impl.getPage().twitterBtn.click();
        Thread.sleep(3000);
    }


    @Then("Title of the page should be Twitter")
    public void title_of_the_page_should_be_twitter() throws InterruptedException {
          Assert.assertEquals("Sauce Labs (@saucelabs) / Twitter", SeleniumUtils.switchToNextWindowGetTitle());
    }

    @When("I click FaceBook button")
    public void i_click_face_book_button() {
        impl.getPage().facebookBtn.click();
    }

    @Then("Title of the page should be Sauce Labs | Facebook")
    public void title_of_the_page_should_be_sauce_labs_facebook() {
        Assert.assertEquals("Sauce Labs - Home | Facebook", SeleniumUtils.switchToNextWindowGetTitle());
    }

    @When("I click LinkedIn button")
    public void i_click_linked_in_button() {
        impl.getPage().linkedidBtn.click();
    }

    @Then("Title of the page should be Sign In | LinkedIn")
    public void title_of_the_page_should_be_sign_in_linked_in() {
        Assert.assertEquals("Sign In | LinkedIn", SeleniumUtils.switchToNextWindowGetTitle());
    }


}
