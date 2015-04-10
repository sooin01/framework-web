package com.my.app.api.exec.main;

import java.net.URI;

import org.springframework.web.util.UriComponentsBuilder;

public class GbisMain extends CommonMain {

	@Override
	protected void run() {
		URI uri = UriComponentsBuilder.fromHttpUrl("http://openapi.gbis.go.kr/ws/rest/buslocationservice")
				.queryParam("serviceKey", "MXyEWCTPUEleDlbEUDhV8sw%2F4WaFqW21si2slwlSPOco8wj%2FiBzVUH%2FCXIDPZAf6uDzkrtVTC51jcVKS8djanw%3D%3D")
				.queryParam("routeId", "200000085")
				.build(true).toUri();

		String response = this.restTemplate.getForObject(uri, String.class);
		System.out.println(response);
	}
	
	public static void main(String[] args) {
		new GbisMain().run();
	}
	
}
