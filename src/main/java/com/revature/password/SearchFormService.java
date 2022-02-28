package com.revature.password;

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
                "    <Title> Search Username Password " +
                "</Title>\n" +
                "<Body> \n" +
                "    <Form action='/userInfo' method ='get'>\n" +
                "        <input type = 'name' name='searchName'/>\n" +
                "        <input type = 'submit' value='Search'/>\n" +
                "    " +
                "</Form>\n" +
                "</Body>\n" +
                "</Html>";
        resp.getWriter().println(HTMLform);

    }
}
