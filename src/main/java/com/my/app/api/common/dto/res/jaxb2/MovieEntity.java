package com.my.app.api.common.dto.res.jaxb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlRootElement(name = "MovieEntity")
@XmlAccessorType(XmlAccessType.FIELD)
public class MovieEntity {

	@XmlElement(name = "MovieCode")
	private String movieCode;
	@XmlElement(name = "KkofMovieCode")
	private String kofMovieCode;
	@XmlElement(name = "MovieName")
	private String movieName;
	@XmlElement(name = "PermissionLevel")
	private String permissionLevel;
	@XmlElement(name = "StatusCode")
	private String statusCode;
	@XmlElement(name = "MovieGubun")
	private String movieGubun;
	@XmlElement(name = "RunningTime")
	private String runningTime;

	public String getMovieCode() {
		return movieCode;
	}

	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}

	public String getKofMovieCode() {
		return kofMovieCode;
	}

	public void setKofMovieCode(String kofMovieCode) {
		this.kofMovieCode = kofMovieCode;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getPermissionLevel() {
		return permissionLevel;
	}

	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMovieGubun() {
		return movieGubun;
	}

	public void setMovieGubun(String movieGubun) {
		this.movieGubun = movieGubun;
	}

	public String getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
