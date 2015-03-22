package com.my.app.api.common.dto.res.xstream;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("MegaboxCinusMovieAllListResponse")
public class MegaboxCinusMovieAllListResponse {

	private Header Header;
	private Body Body;
	
	public Header getHeader() {
		return Header;
	}

	public void setHeader(Header header) {
		Header = header;
	}

	public Body getBody() {
		return Body;
	}

	public void setBody(Body body) {
		Body = body;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
