package com.ebay.ebaytest;

import com.ebay.data.DataProvider;
import com.ebay.pages.HomePage;
import com.ebay.peoplentech.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase{

    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar("Toys");
    }

    @Test(dataProviderClass = DataProvider.class,dataProvider = "searchData")
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.clickOnSearchButton();

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


