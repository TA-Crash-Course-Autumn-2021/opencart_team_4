package com.opencart.dataProviders;

import org.testng.annotations.DataProvider;

public class ProductsDataProvider {

    @DataProvider(name = "products-data")
    public static Object[][] dataProvFunc() {
        return new Object[][]{
                {"Samsung SyncMaster 941BW"},
                {"Nikon D300"},
                {"Apple Cinema 30\""},
                {"Canon EOS 5D"}, {"MacBook"},
                {"macbook air"}};
    }

}
