package com.revature.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassRepositoryTest {
    @Test
    public void getPasswordTest(){
        PassRepository testRepo = new PassRepository("passwordtest.csv");
        Password actual = testRepo.getUsername("Rachel");
        Password expected = new Password("Rachel");
        //Assertions.assertEquals(expected.getName(), actual.getName());
    }
}
