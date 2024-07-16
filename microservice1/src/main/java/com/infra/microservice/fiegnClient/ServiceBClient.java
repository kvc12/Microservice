package com.infra.microservice.fiegnClient;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceb", url = "http://localhost:8080")
public interface ServiceBClient {

    @GetMapping("/serviceb/data")
    Map<String, String> getData();
}

