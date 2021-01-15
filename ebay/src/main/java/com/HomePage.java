package com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class HomePage {

        @FindBy(id = "gh-ac")
        private WebElement searchBar;

        @FindBy(id="gh-btn")
        private WebElement searchButton;

        @FindBy(id="gh-p-1")
        private WebElement dailyDeals;

        @FindBy(xpath ="//a[contains(text(),'Brand Outlet')]")
        private WebElement brandOutlet;


        @FindBy(xpath ="//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1])]")
        private WebElement helpAndContact;

        @FindBy(xpath ="//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-p-2']/a[1]")
        private WebElement sell;


        public void typeOnSearchBar(){
            searchBar.sendKeys("Java Books");
        }

        public void typeOnSearchButton(){
            searchButton.click();
        }

        public void ClickOnDailyDeals(){
           dailyDeals.click();
        }

        public void clickOnBrandOutlet(){
            brandOutlet.click();
        }
        public void clickOnHelpNContact(){
            helpAndContact.click();
        }
        public void clickOnSellButton(){
           sell.click();
        }


    }
