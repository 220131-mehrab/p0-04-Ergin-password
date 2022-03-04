package com.revature.password.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Password  {
    @JsonProperty("id")
    private String id;
    private String password;
    private String name;
    private String lastname;
    private String email;
    private String phone;

    public static Password of() {
        return new Password();
    }

    public Password id(String id) {
        this.id = id;
        return this;
    }

    public Password name(String name) {
        this.name = name;
        return this;
    }

    public Password lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Password password(String password) {
        this.password = password;
        return this;
    }

    public Password email(String email) {
        this.email = email;
        return this;
    }

    public Password phone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Password{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, name, lastname, email, phone);
    }

    public Object getName() {
        return null;
    }
}
