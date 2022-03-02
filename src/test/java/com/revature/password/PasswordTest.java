package com.revature.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PasswordTest {

    @Test
    //create a method
    public void constructorTest(){
        String name = "Laura";
        Password password = new Password(name);
        password = new Password(2,"Laura","lauragrey@revature.net","234-567-8901");
    }

    @Test
    public void builderTest(){
        Password actual = Password.of().id(1).name("Rachel").email("rachelbooker@revature.net").phone("123-456-7890");
        Assertions.assertEquals("Rachel",actual.getName());
        actual = Password.of().email("lauragrey@revature.net").name("Laura").phone("234-567-8901").id(2);
    }

    @Test
    public void nameTest(){
        Password password = new Password("Mary");
        Assertions.assertEquals("Mary", password.getName());
        password = new Password("Jamie");
        Assertions.assertEquals("Jamie",password.getName());
    }

    @Test
    public void comparatorTests(){
        List<Password> passwordList = Arrays.asList(
                Password.of().id(1).name("Rachel").email("racherlbooker@revature.net").phone("123-456-7890"),
                Password.of().id(2).name("Rachel").email("racherlbooker@revature.net").phone("123-456-7890"),
                Password.of().id(3).name("Laura").email("lauragrey@revature.net").phone(""),
                Password.of().id(4).name("Craig").email("craigjohnson@revature.net").phone("345-678-9012")
        );
        System.out.println(passwordList.toString());
        passwordList.sort(null);
        System.out.println(passwordList.toString());

//        passwordList.sort(new Comparator<Password>() {
//            @Override
//            public int compare(Password o1, Password o2) {
//                return Integer.compare(o1.getName().length(),o2.getName().length());
//            }
//        });
//        passwordList.sort((Comparator<Password>) (Password p1 ,Password p2)->{
//            return Integer.compare(p1.getName().length(),p2.getName().length());});
        passwordList.sort((o1,o2) -> Integer.compare(o1.getName().length(),o2.getName().length()));
        System.out.println(passwordList.toString());
    }

}
