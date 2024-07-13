package com.infra.microservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infra.microservice.fiegnClient.ServiceBClient;

@RestController
@RequestMapping("/service-a")
public class ServiceAController {

	private final ServiceBClient serviceBClient;

	public ServiceAController(ServiceBClient serviceBClient) {
		this.serviceBClient = serviceBClient;
	}

	@GetMapping("/")
	public String serviceA() {
		return "Hello from Service A!";
	}

	@GetMapping("/fetch-data")
	public Map<String, String> fetchdata() {
		Map<String, String> result = serviceBClient.getData();
		return result;

	}

}
