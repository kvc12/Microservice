package com.infra.microservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceb")
public class ServiceBController {

	@GetMapping("/")
	public String serviceA() {
		return "Hello from Service B!";
	}

	@GetMapping("/data")
	public Map<String, String> getData() {
		Map<String, String> data = new HashMap<>();
		data.put("id", "123");
		data.put("name", "kevak");
		return data;
	}
}
