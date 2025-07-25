package org.finSecure.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverSupplier implements Browser{
    WebDriver driver;
    @Override
    public WebDriver createDriver(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
