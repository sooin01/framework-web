package com.my.app.api.exec.main;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.my.app.api.common.dto.res.jaxb2.MegaboxCinusMovieAllListResponse;

public class Jaxb2Main extends CommonMain {

	public Jaxb2Main(String id) {
		super(id);
	}
	
	@Override
	public void run() {
		String url = "https://icewine.megabox.co.kr/McBookingService_Test/OnlineMCBookingService.asmx/MegaboxCinus Movie All List";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("serviceKey", "JkB7CKefL/D14G/diXSJaKIeXEvfWSCBFNHvgxnyUp8=");

		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(map, headers);
		ResponseEntity<MegaboxCinusMovieAllListResponse> responseEntity = this.restTemplate.postForEntity(url, requestEntity, MegaboxCinusMovieAllListResponse.class);
		
		System.out.println(responseEntity.getBody());
	}
	
	public static void main(String[] args) {
		new Jaxb2Main("jaxb2RestTemplate").run();
	}
	
}
