package com.my.app.api.exec.main;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestMain {
	
	public static void log(Object o) {
		try {
			String value = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(o);
			System.out.println(value);
		} catch (JsonProcessingException e) {
		}
	}

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		String url = "http://localhost:8080/app/multipartFormData";
		
		String response = restTemplate.postForObject(url, null, String.class);
		log(response);
	}
	
}
