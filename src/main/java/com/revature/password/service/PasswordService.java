package com.revature.password.service;

import com.revature.password.domain.Password;
import com.revature.password.repository.PassRepository;

import java.util.List;
import java.util.Locale;

//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//it doesn't extend the http servlet anymore right below
public class PasswordService {
    //constructor field
    private PassRepository passRepository;

    public PasswordService(PassRepository passRepository){
        this.passRepository = passRepository;
    }


    //@Override
    public String searchForm(){

    //protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLform = "<Html>\n" +
                "<Head></Head>\n" +
                "    <Title>Search Username Password " +
                "</Title>\n" +
                "<Body> \n" +
                "<h1>Userinfo Search</h1>\n" +
                "    \n"+
                "    <form action='/userInfo' method ='get'>\n" +
                "        <input type = 'name' name='searchName'/>\n" +
                "        <input type = 'submit' value='Search'/>\n" +
                "        <a href='userInfo'> See full List</a>\n" +
                "</form>\n" +
                "\n" +
                "</Body>\n" +
                "</Html>";
        return HTMLform;
        //resp.getWriter().println(HTMLform);

    }
    public List<Password> getPassword(){
        return passRepository.getUserPass();

    }

    public Password getPassword(String userName) {
        return passRepository.getUserName(userName.trim().toUpperCase());
    }
}
