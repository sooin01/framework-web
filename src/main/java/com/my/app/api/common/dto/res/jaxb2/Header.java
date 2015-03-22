package com.my.app.api.common.dto.res.jaxb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlRootElement(name = "Header")
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

	@XmlElement(name = "CorpName")
	private String corpName;
	@XmlElement(name = "ServiceType")
	private String serviceType;
	@XmlElement(name = "ResultCode")
	private String resultCode;
	@XmlElement(name = "ResultMessage")
	private String resultMessage;
	@XmlElement(name = "ResultCount")
	private String resultCount;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCount() {
		return resultCount;
	}

	public void setResultCount(String resultCount) {
		this.resultCount = resultCount;
	}

}
