package com.my.app.api.common.dto.res.jackson;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Header {

	@JacksonXmlProperty
	private String CorpName;
	@JacksonXmlProperty
	private String ServiceType;
	@JacksonXmlProperty
	private String ResultCode;
	@JacksonXmlProperty
	private String ResultMessage;
	@JacksonXmlProperty
	private String ResultCount;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public String getCorpName() {
		return CorpName;
	}

	public void setCorpName(String corpName) {
		CorpName = corpName;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

	public String getResultCode() {
		return ResultCode;
	}

	public void setResultCode(String resultCode) {
		ResultCode = resultCode;
	}

	public String getResultMessage() {
		return ResultMessage;
	}

	public void setResultMessage(String resultMessage) {
		ResultMessage = resultMessage;
	}

	public String getResultCount() {
		return ResultCount;
	}

	public void setResultCount(String resultCount) {
		ResultCount = resultCount;
	}

}
