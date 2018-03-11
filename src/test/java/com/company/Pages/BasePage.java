package com.company.Pages;

import com.company.Common.Constants;
import com.company.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Student on 04.03.2018.
 */
public class BasePage {
  public static WebDriver driver= com.company.Driber.DriverFactory.getDriver();


    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
