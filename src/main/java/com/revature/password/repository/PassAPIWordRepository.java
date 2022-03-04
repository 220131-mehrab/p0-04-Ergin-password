package com.revature.password.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.revature.password.domain.PassAPIWord;
import com.revature.password.domain.Password;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class PassAPIWordRepository implements PassRepository{
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public Password getUserName(String userName) {
        Password result = null;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("c:/users/ergin/Downloads/Password."))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String httpBody =response.body();
            result = mapper.readValue(httpBody, Password.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Password> getUserPass() {
        return null;
    }
}
