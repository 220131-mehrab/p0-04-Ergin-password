package com.revature.password;

import java.util.Objects;

public class Password implements Comparable<Password>{
    private int passID;
    private String name;
    private String email;
    private String phone;

    public Password(){

    }

    public Password(String name){
        this(-1,name,"","");
    }

    public Password(int passID, String name, String email, String phone) {
        this.passID = passID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public static Password of(){
        return new Password();
    }

    public Password id(int id){
        this.passID = id;
        return this;
    }


    public Password name(String name){
        this.name = name;
        return this;
    }

    public Password email(String email){
        this.email = email;
        return this;
    }

    public Password phone(String phone){
        this.phone = phone;
        return this;
    }

    public String getName(){
        return this.name;
    }

    public int getPassID() {
        return passID;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Password{" +
                "passID=" + passID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return passID == password.passID && Objects.equals(name, password.name) && Objects.equals(email, password.email) && Objects.equals(phone, password.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passID, name, email, phone);
    }

    @Override
    public int compareTo(Password o) {
        return Integer.compare(this.passID, o.getPassID());
    }
}
