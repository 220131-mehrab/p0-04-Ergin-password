package com.revature.password;

public class Password {
    private String name;


    public Password(String name){
        this.name=name;

    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
