package com.company.Test;

import com.company.Users.UserFactory;
import com.company.Users.Users;
import org.testng.annotations.AfterSuite;

/**
 * Created by Student on 04.03.2018.
 */
public class BaseTest {

    protected static Users validUser = UserFactory.getValidUser();
   protected static App app = new App();




    @AfterSuite
    public void tearDownSuite() throws Exception {
     app.common.stopApp();

    }
}
