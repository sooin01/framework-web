package com.my.app.api.common.dto.res.jackson;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class MegaboxCinusMovieAllListResponse {

	@JacksonXmlProperty
	private Header Header;
	@JacksonXmlProperty
	private Body Body;
	
	public Header getHeader() {
		return this.Header;
	}

	public void setHeader(Header header) {
		this.Header = header;
	}

	public Body getBody() {
		return this.Body;
	}

	public void setBody(Body body) {
		this.Body = body;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
