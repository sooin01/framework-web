package com.my.app.api.common.dto.res.xstream;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class MovieEntity {

	private String MovieCode;
	private String KofMovieCode;
	private String MovieName;
	private String PermissionLevel;
	private String StatusCode;
	private String MovieGubun;
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
