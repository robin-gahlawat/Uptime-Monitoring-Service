package com.cdc.uptime.service.impl;

import com.cdc.uptime.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestServiceImpl implements RequestService {

    //todo:
        //Add Logger
        // read about public/private for interface/class
        // make its UI in react
        // Ensure your interface is implemented by two classes one that does http request and other that does grpc/graphql

    @Override
    public void sendHeadRequest(String url) {  //todo: why do we need to make this method public?
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Void> response = restTemplate.exchange(url, HttpMethod.HEAD, null, Void.class);

        // Getting headers from the response
        HttpHeaders headers = response.getHeaders();

        // Displaying some headers
        System.out.println("Content-Type: " + headers.getContentType());
        System.out.println("Content-Length: " + headers.getContentLength());
        System.out.println("Last-Modified: " + headers.getLastModified());

    }

}
