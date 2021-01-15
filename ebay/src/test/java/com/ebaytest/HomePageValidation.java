package com.ebaytest;

import com.HomePage;
import com.peoplentech.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test
    public void validateUserBeingAbleToSearchForAnItem() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchButton();

    }

    @Test
    public void validateUserBeingAbleToClickOnDailyDeals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnDailyDeals();

    }

    @Test
    public void validateUserBeingAbleToClickOnBrandOutlet() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnBrandOutlet();

    }
    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnHelpNContact() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnHelpNContact();

    }

    @Test
    public void validateUserBeingAbleToClickOnSellButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSellButton();

    }




}


