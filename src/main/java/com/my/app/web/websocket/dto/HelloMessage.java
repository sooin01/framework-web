package com.my.app.web.websocket.dto;

import com.my.app.web.common.dto.CommonDto;

public class HelloMessage extends CommonDto {

	String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
