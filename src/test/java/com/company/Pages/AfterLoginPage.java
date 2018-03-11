package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterLoginPage extends BasePage{
    @FindBy(xpath = "//li/span[@class='sn_menu_title']")
    private WebElement userEmail;

    public String getUserEmail() {
        return userEmail.getText();
    }

}

