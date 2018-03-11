package com.company.Driber;

import com.company.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Student on 10.03.2018.
 */
public  class DriverFactory {
    static  WebDriver driver;
    public static WebDriver getDriver(){
        String property = System.getProperty("driver");
                if ("ie".equals(property)) {
                    System.setProperty("webdriver.ie.driver", "C:\\Users\\Student\\212\\Driver\\IEDriverServer.exe");
                    DriverFactory.driver = new InternetExplorerDriver();
                }else {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\212\\Driver\\chromedriver.exe");
                    DriverFactory.driver = new ChromeDriver();
                }

        DriverFactory.driver.get(Constants.BASE_URL);
          DriverFactory.driver.manage().window().maximize();
         DriverFactory.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return   DriverFactory.driver;
    }
}
