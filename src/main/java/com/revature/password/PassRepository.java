package com.revature.password;

import java.util.List;

public interface PassRepository {
    Password getUserName(String userName);
    List<Password> getUserPass();

}
