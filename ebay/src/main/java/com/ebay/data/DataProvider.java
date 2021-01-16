package com.ebay.data;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "searchData")
    public Object[] getSearchData(){
        return new Object[]{"Compressed-Gas","Micro phone","Wallet"};

    }


}
