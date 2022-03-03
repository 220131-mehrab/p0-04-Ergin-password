package com.revature.password.repository;

import com.revature.password.domain.Password;

import java.util.List;

public interface PassRepository {
    Password getUserName(String userName);
    List<Password> getUserPass();

}
