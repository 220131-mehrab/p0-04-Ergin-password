/*
package com.revature.password;

import com.revature.password.domain.Password;
import com.revature.password.repository.CSVPassRepository;
import com.revature.password.repository.PassAPIWordRepository;
import com.revature.password.repository.SQLPassRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassRepositoryTest {
    @Test
    public void getCSVPasswordTest(){
        CSVPassRepository testRepo = new CSVPassRepository("passwordtest.csv");
        Password actual = testRepo.getUserName("Rachel");
        Password expected = Password.of().name("Rachel");
        //Assertions.assertEquals(expected.getName(), actual.getName());
   }
//    @Test
//    public void getAPIPasswordTest(){
//        PassAPIWordRepository testRepo = new PassAPIWordRepository();
//        System.out.println(testRepo.getUserName("Mary"));
//    }

    @Test
    public void getSQLPasswordTest(){
        SQLPassRepository testRepo = new SQLPassRepository();
        System.out.println(testRepo.getUserName("Rachel"));
        Password actual = Password.of().id(1).name("Rachel").email("rachelbooker@revature.net").phone("123-456-7890");
        Assertions.assertEquals(testRepo.getUserName("Rachel"),actual);
    }*/
