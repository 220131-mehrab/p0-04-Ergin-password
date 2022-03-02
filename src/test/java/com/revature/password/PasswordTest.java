package com.revature.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    //create a method
    public void constructorTest(){
        String name = "Laura";
        Password password = new Password(name);
    }
    @Test
    public void nameTest(){
        Password password = new Password("Mary");
        Assertions.assertEquals("Mary", password.getName());
        password = new Password("Jamie");
        Assertions.assertEquals("Jamie",password.getName());
    }

}
