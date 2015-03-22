package com.my.app.api.exec.main;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpsMain {

	public static void main(String[] args) throws Exception {
		String url = "https://www.google.com";
		ResponseEntity<String> response = new RestTemplate().exchange(url, HttpMethod.GET, null, String.class);
		System.out.println(response.getBody());
	}

}
