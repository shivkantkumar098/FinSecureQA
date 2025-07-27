package org.finSecure.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// This file is part of the FinSecure project.
public class FirefoxDriverSupplier implements Browser{
    WebDriver driver;
    @Override
    public WebDriver createDriver(){
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
