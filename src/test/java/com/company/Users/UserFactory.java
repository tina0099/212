package com.company.Users;

import com.company.Utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Student on 04.03.2018.
 */
public class UserFactory  {
  public static Users getValidUser(){
      ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
      return new Users(resourceBundle.getString("login"),
              resourceBundle.getString("password"),
              Utils.Random.getRandomEmail());
        }
//  public static List<Users> getValidUserList(int count){
//      return Stream.generate(UserFactory::getValidUser).limit(count).collect(Collectors.toList());
//
//  }

}
