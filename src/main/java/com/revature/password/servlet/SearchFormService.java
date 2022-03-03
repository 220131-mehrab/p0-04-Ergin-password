package com.revature.password.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLform = "<Html>\n" +
                "<Head></Head>\n" +
                "    <Title>Search Username Password " +
                "</Title>\n" +
                "<Body> \n" +
                "<h1>Userinfo Search</h1>\n" +
                "    \n"+
                "    <Form action='userInfo' method ='get'>\n" +
                "        <input type = 'name' name='searchName'/>\n" +
                "        <input type = 'submit' value='Search'/>\n" +
                "    " +
                "<a href='userInfo'> See full List</a>\n" +
                "</Form>\n" +
                "\n" +
                "</Body>\n" +
                "</Html>";
        resp.getWriter().println(HTMLform);

    }
}
