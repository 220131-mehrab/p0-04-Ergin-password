package com.revature.password.servlet;

import com.revature.password.domain.Password;
import com.revature.password.service.PasswordService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PassServlet extends HttpServlet {
    PasswordService service;

    public PassServlet(PasswordService service) {
        this.service = service;
    }
    List<Password> results = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("searchName");

        resp.getWriter().println(service.searchForm());

        if (userName != null) {
            results.add(service.getPassword(userName));
        } else {

            results.addAll(service.getPassword());
        }
        resp.getWriter().println(results);
    }
}
