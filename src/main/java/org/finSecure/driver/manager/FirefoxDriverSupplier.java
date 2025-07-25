package org.finSecure.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverSupplier implements Browser{
    WebDriver driver;
    @Override
    public WebDriver createDriver(){
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
