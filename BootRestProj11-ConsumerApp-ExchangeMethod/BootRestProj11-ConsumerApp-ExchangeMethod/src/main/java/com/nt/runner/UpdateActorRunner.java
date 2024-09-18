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

@Component
public class UpdateActorRunner implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // producer url
        String serviceUrl = "http://localhost:4041/RestMiniProject/actor-api/update";
        // Request body
        String json_body = "{\"aid\": 102,\"aname\":\"Tiger Shroff\",\"addrs\":\"Delhi\",\"remuneration\": 4567098.987,\"active_SW\":\"active\"}";
        // create header
        HttpHeaders header = new HttpHeaders();
        // set header
        header.setContentType(MediaType.APPLICATION_JSON);
        // create entity
        HttpEntity<String> entity = new HttpEntity<String>(json_body, header);
        // invoke exhange()
        ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.PUT, entity, String.class);

        // process response
        System.out.println(response.getHeaders() + "/n/n");
        System.out.println(response.getBody() + "/n/n");
        System.out.println(response.getStatusCode() + "/n/n");

        // exit
        System.exit(0);

    }

}
