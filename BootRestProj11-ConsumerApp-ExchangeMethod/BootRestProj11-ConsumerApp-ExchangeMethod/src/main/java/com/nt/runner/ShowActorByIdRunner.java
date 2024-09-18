package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ShowActorByIdRunner implements CommandLineRunner {

    // inject RestTemplate obj
    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // service url
        String serviceUrl = "http://localhost:4041/RestMiniProject/actor-api/get/102";
        // String serviceUrl =
        // "http://localhost:4041/RestMiniProject/actor-api/get/{id}";
        // use exchange
        ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.GET, null, String.class);
        // ResponseEntity<String> response = template.exchange(serviceUrl,
        // HttpMethod.GET, null, String.class, 102);

        // process response
        System.out.println("\nResponse Head: " + response.getHeaders() + "\n\n");
        System.out.println("\nResponse Body: " + response.getBody() + "\n\n");
        System.out.println("\nResponse Code: " + response.getStatusCode() + "\n\n");
    }

}
