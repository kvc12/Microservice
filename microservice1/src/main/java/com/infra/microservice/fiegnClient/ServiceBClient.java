package com.infra.microservice.fiegnClient;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceb")
public interface ServiceBClient {
	
	@GetMapping("/data")
	public Map<String, String> getData();

}
