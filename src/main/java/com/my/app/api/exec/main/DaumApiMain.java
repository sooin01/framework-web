package com.my.app.api.exec.main;

import java.net.URI;

import org.springframework.web.util.UriComponentsBuilder;

public class DaumApiMain extends CommonMain {
	
	String[] urls = {
			"http://apis.daum.net/search/web",
			"https://apis.daum.net/local/geo/addr2coord"
	};
	
	@Override
	public void run() {
		String url = this.urls[1];
		
		URI uri = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam("output", "json")
				.queryParam("apikey", "b62b20a07b737c1cca5b88737980adb11809762a")
				.queryParam("q", "서울 종로구 종로3가").build().toUri();
		
		String s = this.restTemplate.getForObject(uri, String.class);
		this.json(s);
	}

	public static void main(String[] args) {
		new DaumApiMain().run();
	}

}
