package com.revature.password.domain;

public class PassAPIWord extends Password{
    private Long id;
    private Long password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Long getID() { return id; }
    public void setID(Long value) { this.id = value; }

    public Long getPassword() { return password; }
    public void setPassword(Long value) { this.password = value; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String value) { this.phoneNumber = value; }
}
