package com.opencart.navigation;

import com.opencart.driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import java.util.concurrent.TimeUnit;

public class Navigation {

    private WebDriver driver;

    public Navigation() {
        driver = DriverRepository.DRIVERS.get();
    }

    public void navigateToUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
}
