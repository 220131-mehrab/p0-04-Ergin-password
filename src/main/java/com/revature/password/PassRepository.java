package com.revature.password;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassRepository {
    //Creating a list of Strings for the Repo as we named it userpass
    private List<String> userPass;
    private InputStream file;

    //Constructor for the Repo
    public PassRepository(String filename) {
        this.userPass = new ArrayList<>();
        //pass the file
        //after using getClass. we don't need this line anymore.
        //this.file = new File("src/main/resources/" + filename);
        //This line will search thr every single folder to find the file
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        //then load the file,call load
        load();
    }
    //creation of the load method
    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            this.userPass.add(scanner.next());
        }
    }

    public List<String> getUserPass() {
        return userPass;
    }
}
