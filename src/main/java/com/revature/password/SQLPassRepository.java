package com.revature.password;

import java.util.List;

public class SQLPassRepository implements PassRepository{
    //as application of Polimorphism PassRepository is taking the form of the other repositories
    @Override
    public Password getUserName(String userName) {
        return null;
    }

    @Override
    public List<Password> getUserPass() {
        return null;
    }
}
