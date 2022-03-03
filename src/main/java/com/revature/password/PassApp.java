package com.revature.password;

//import java.io.File;

import com.revature.password.repository.InMemoryPassRepository;
import com.revature.password.repository.PassRepository;
import com.revature.password.servlet.DefaultServlet;
import com.revature.password.servlet.PassService;
import com.revature.password.servlet.SearchFormService;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class PassApp {
    public static void main (String[] args){
        String webPassAppName = "password";
        PassRepository passRepository;
        //File fileSource = new File("password.csv");
        //passRepository = new CSVPassRepository("password.csv");
        passRepository = new InMemoryPassRepository();
        PassService passService = new PassService(passRepository);
        SearchFormService sfService = new SearchFormService();

        Tomcat server = new Tomcat();
        //next line is for to clean up the dir system from TomCat Folder
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        //server.setPort(0);
        server.getConnector();
        server.addContext("webPassAppName",null);
        //we added mapping at the end since we needed a URL
        server.addServlet("webPassAppName","defaultServlet",new DefaultServlet()).addMapping("/*");
        server.addServlet("webPassAppName","passServlet",passService).addMapping("/userInfo");
        server.addServlet("webPassAppName","searchFormServlet",sfService).addMapping("/search");

        //System.out.println("Server is running on port number : " + server.getConnector().getPort());
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
