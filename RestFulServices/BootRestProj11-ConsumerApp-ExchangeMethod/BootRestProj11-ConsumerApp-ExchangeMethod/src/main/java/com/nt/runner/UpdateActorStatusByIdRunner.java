package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UpdateActorStatusByIdRunner implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // service url
        String serviceUrl = "http://localhost:4041/RestMiniProject/actor-api/supdate/{id}/{status}";
        // patch mode rqueires extra dependency (httpCLient5)
        template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

        // use patchForObject
        ResponseEntity<String> response = template.exchange(serviceUrl, HttpMethod.PATCH, null, String.class, 202,
                "deactive");
        // process response
        System.out.println("\n" + response.getHeaders());
        System.out.println("\n" + response.getBody());
        System.out.println("\n" + response.getStatusCode());

        // exit
        System.exit(0);

    }

}
