package com.my.app.api.common.dto.res.jaxb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlRootElement(name = "MegaboxCinusMovieAllListResponse", namespace = "http://icewine.megabox.co.kr/MCBookingService")
@XmlAccessorType(XmlAccessType.FIELD)
public class MegaboxCinusMovieAllListResponse {

	@XmlElement(name = "Header")
	private Header header;
	@XmlElement(name = "Body")
	private Body body;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
