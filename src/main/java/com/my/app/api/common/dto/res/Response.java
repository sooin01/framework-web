package com.my.app.api.common.dto.res;

public class Response {

	private Header header;
	private Body body;

	public Header getHeader() {
		return this.header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

}
