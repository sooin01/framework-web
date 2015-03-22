package com.my.app.api.exec.main;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.my.app.api.common.dto.res.jackson.MegaboxCinusMovieAllListResponse;

public class JacksonMain extends CommonMain {
	
	public JacksonMain(String id) {
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
		MegaboxCinusMovieAllListResponse res = this.restTemplate.postForObject(url, requestEntity, MegaboxCinusMovieAllListResponse.class);
		
		System.out.println(res);
	}

	public static void main(String[] args) {
		new JacksonMain("sourceRestTemplate").run();
	}
	
}
