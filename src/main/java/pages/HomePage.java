package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> items;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addBtn;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBtn;

    @FindBy(xpath = "//li[@class='social_twitter']")
    public WebElement twitterBtn;

    @FindBy(xpath = "//li[@class='social_facebook']")
    public WebElement facebookBtn;

    @FindBy(xpath = "//li[@class='social_linkedin']")
    public WebElement linkedidBtn;



}
