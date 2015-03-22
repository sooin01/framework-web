package com.my.app.api.common.dto.res.xstream;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Header {

	private String CorpName;
	private String ServiceType;
	private String ResultCode;
	private String ResultMessage;
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
