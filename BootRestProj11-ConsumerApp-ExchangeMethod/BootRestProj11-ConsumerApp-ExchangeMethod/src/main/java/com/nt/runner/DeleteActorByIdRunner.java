package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class DeleteActorByIdRunner implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // service url
        String ServiceUrl = "http://localhost:4041/RestMiniProject/actor-api/delete/{id}";
        // invoke exchange()
        ResponseEntity<String> response = template.exchange(ServiceUrl, HttpMethod.DELETE, null, String.class, 302);

        // process response
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());

        System.exit(0);
    }

}
