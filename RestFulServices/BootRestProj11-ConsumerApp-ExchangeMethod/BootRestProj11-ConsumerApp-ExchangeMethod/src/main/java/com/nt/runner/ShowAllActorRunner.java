package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ShowAllActorRunner implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {

        // service url
        String url = "http://localhost:4041/RestMiniProject/actor-api/report";
        // call api
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, null, String.class);

        // process response
        System.out.println("Response Head: " + response.getHeaders());
        System.out.println("Response Body: " + response.getBody());
        System.out.println("Response Code: " + response.getStatusCode());

    }

}
