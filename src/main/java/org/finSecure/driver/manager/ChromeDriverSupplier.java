package org.finSecure.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// This file is part of the FinSecure project.
public class ChromeDriverSupplier implements  Browser{
    // this class is a placeholder for ChromeDriver management
    // In a real implementation, this class would contain methods to manage the ChromeDriver instance
    WebDriver driver;
    @Override
    public WebDriver createDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
