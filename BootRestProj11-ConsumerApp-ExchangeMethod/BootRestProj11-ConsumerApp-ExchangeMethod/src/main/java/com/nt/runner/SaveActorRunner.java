package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class SaveActorRunner implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // service url
        String serviceurl = "http://localhost:4041/RestMiniProject/actor-api/save";
        // request body
        String josn_request = "{\"aname\":\"Amzad ka Bhai\",\"addrs\":\"Hyderabad\",\"remuneration\": 875698654.987,\"active_SW\":\"active\"}";
        // create header
        HttpHeaders headers = new HttpHeaders();
        // set header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // create entity
        HttpEntity<String> entity = new HttpEntity<String>(josn_request, headers);
        // invoke exchange()
        ResponseEntity<String> response = template.exchange(serviceurl, HttpMethod.POST, entity, String.class);
        // process response
        System.out.println("\nResponse Head: " + response.getHeaders().toString() + "\n\n");
        System.out.println("\nResponse Body: " + response.getBody() + "\n\n");
        System.out.println("\nResponse Code: " + response.getStatusCode() + "\n\n");

    }

}
