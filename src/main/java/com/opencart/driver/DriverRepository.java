package com.opencart.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverRepository {

    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    private static WebDriver webDriver;

    private DriverRepository() {
    }

    public static void downloadWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();


        DRIVERS.set(webDriver);
    }

    public static void closeBrowser() {
        webDriver.quit();
    }
}
