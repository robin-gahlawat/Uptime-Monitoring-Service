package com.cdc.uptime.controller;

import com.cdc.uptime.service.RequestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class RequestController {

    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/add")
    public void addRequest(@RequestParam("url") String url) {
        requestService.sendHeadRequest(url);
        System.out.println("Request: " + url);
    }

}
