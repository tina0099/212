package com.company.Helpers;

import com.company.Pages.BasePage;

/**
 * Created by Student on 04.03.2018.
 */
public class CommonHelper extends BasePage {
    public void stopApp(){
        driver.quit();
    }
}
