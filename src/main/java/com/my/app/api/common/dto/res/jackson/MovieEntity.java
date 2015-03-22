package com.my.app.api.common.dto.res.jackson;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class MovieEntity {

	@JacksonXmlProperty
	private String MovieCode;
	@JacksonXmlProperty
	private String KofMovieCode;
	@JacksonXmlProperty
	private String MovieName;
	@JacksonXmlProperty
	private String PermissionLevel;
	@JacksonXmlProperty
	private String StatusCode;
	@JacksonXmlProperty
	private String MovieGubun;
	@JacksonXmlProperty
	private String RunningTime;

	public String getMovieCode() {
		return MovieCode;
	}

	public void setMovieCode(String movieCode) {
		MovieCode = movieCode;
	}

	public String getKofMovieCode() {
		return KofMovieCode;
	}

	public void setKofMovieCode(String kofMovieCode) {
		KofMovieCode = kofMovieCode;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public String getPermissionLevel() {
		return PermissionLevel;
	}

	public void setPermissionLevel(String permissionLevel) {
		PermissionLevel = permissionLevel;
	}

	public String getStatusCode() {
		return StatusCode;
	}

	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}

	public String getMovieGubun() {
		return MovieGubun;
	}

	public void setMovieGubun(String movieGubun) {
		MovieGubun = movieGubun;
	}

	public String getRunningTime() {
		return RunningTime;
	}

	public void setRunningTime(String runningTime) {
		RunningTime = runningTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
