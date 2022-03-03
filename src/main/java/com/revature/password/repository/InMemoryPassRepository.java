package com.revature.password.repository;

import com.revature.password.domain.Password;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPassRepository implements PassRepository{
    private List<Password> userPassword;

    public InMemoryPassRepository(){
        userPassword = new ArrayList<>();
        userPassword.add(Password.of().id(1).name("Rachel").email("rachelbooker@revature.net").phone("123-456-7890"));
    }



    public List<Password> getUserPass() {
        return userPassword;
    }

    public Password getUserName(String userName){
        Password result = null;
        for (Password name : this.userPassword){
            if (name.getName().equals(name)){
                result = name;
            }
        }
        return result;
    }
}
