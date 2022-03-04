package com.revature.password;

import com.revature.password.repository.CSVPassRepository;
import com.revature.password.repository.PassRepository;
import com.revature.password.servlet.DefaultServlet;
import com.revature.password.servlet.PassServlet;
import com.revature.password.service.PasswordService;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class PassApp {
    public static void main (String[] args){
        PassRepository passRepository;
        passRepository = new CSVPassRepository("password.csv");
        PasswordService passwordService = new PasswordService(passRepository);

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.getConnector();
        server.addContext("",null);
        server.addServlet("","defaultServlet",new DefaultServlet()).addMapping("/what");
        server.addServlet("","passServlet", new PassServlet(passwordService)).addMapping("/userInfo");

        try {
            server.start();
            System.out.println("Server running on http://localhost:" + server.getConnector().getLocalPort());
            server.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
