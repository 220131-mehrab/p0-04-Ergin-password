package com.revature.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassRepositoryTest {
    @Test
    public void getCSVPasswordTest(){
        CSVPassRepository testRepo = new CSVPassRepository("passwordtest.csv");
        Password actual = testRepo.getUserName("Rachel");
        Password expected = new Password("Rachel");
        //Assertions.assertEquals(expected.getName(), actual.getName());
    }
}
