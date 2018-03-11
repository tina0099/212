package com.company.Helpers;

import com.company.Pages.LoginPage;
import com.company.Users.UserFactory;
import com.company.Users.Users;

/**
 * Created by Student on 04.03.2018.
 */
public class LoginHelper extends LoginPage {
  public void loginValidUser (){
     Users validUser = UserFactory.getValidUser();
      login(validUser.getLogin(),validUser.getPassword());

    }
}
