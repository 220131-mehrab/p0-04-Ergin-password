package com.revature.password.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class DefaultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filename = req.getPathInfo().replaceFirst("/","");
        if (filename.equals("")){
            filename = "index.html";
        }
        //Searching the file in the folders
        InputStream file = getClass().getClassLoader().getResourceAsStream(filename);
        if (file == null){
            resp.setStatus(404);
            resp.getWriter().println("Try /webPassAppName/search or /webPassAppName/userInfo");
            return;
        }
        IOUtils.copy(file,resp.getOutputStream());
    }
}
