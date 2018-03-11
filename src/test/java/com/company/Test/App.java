package com.company.Test;

import com.company.Helpers.AfterLoginHelper;
import com.company.Helpers.CommonHelper;
import com.company.Helpers.LoginHelper;

/**
 * Created by Student on 04.03.2018.
 */
public class App {
    public LoginHelper login;
    public AfterLoginHelper afterLogin;
    public CommonHelper common;

    public App() {
        login = new LoginHelper();
       afterLogin = new AfterLoginHelper();
    }
}
