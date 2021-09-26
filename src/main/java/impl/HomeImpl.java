package impl;

import pages.HomePage;
import utils.SeleniumUtils;

public class HomeImpl {
    HomePage page;

    public HomePage getPage(){
        if(page==null)
            page = new HomePage();
        return page;
    }

    public void iClickOnButton(String buttonName) {
        switch (buttonName.toLowerCase()){
            case "twitter": getPage().twitterBtn.click();
                break;
            case "facebook": getPage().facebookBtn.click();
                break;
            case "linkedin": getPage().linkedidBtn.click();
                break;
            default:
                System.out.println("button was not found");
        }
    }
}
