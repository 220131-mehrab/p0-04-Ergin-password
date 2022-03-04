package com.revature.password.repository;

import com.revature.password.domain.Password;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVPassRepository implements PassRepository {
    private List<Password> userPass;
    private InputStream file;

    public CSVPassRepository(String filename) {
        this.userPass = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();

    }
    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        int i = 0;
        while (scanner.hasNext()){
            String[] passColumns = scanner.next().split(";");
            System.out.println(passColumns[i]);
            Password temp = Password.of().id(passColumns[0])
                    .password(passColumns[1])
                    .name(passColumns[2])
                    .lastname(passColumns[3])
                    .email(passColumns[4])
                    .phone(passColumns[5]);
            this.userPass.add(temp);
            i++;
        }
    }
    public List<Password> getUserPass() {
        return userPass;
    }

    public Password getUserName(String userName){
        Password result = null;
        for (Password name : this.userPass){
            if (name.getName().equals(name)){
                result = name;
            }
        }
        return result;
    }
}
