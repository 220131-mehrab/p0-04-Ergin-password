package com.revature.password;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//This is the program the TomCat will run
//We extend the class since now we are using Tomcat framework
public class PassService extends HttpServlet {
    //access the repository
    private PassRepository passRepository;

    public PassService(PassRepository passRepository) {
        this.passRepository = passRepository;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // we created a getUserPass method in passRepository we will use it here
        for (String userinfo: passRepository.getUserPass()){
            resp.getWriter().println(userinfo);
        }
    }
}
