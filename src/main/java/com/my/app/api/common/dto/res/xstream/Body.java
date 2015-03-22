package com.my.app.api.common.dto.res.xstream;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Body {

	@XStreamImplicit
	List<MovieEntity> MovieEntity;

	public List<MovieEntity> getMovieEntity() {
		return MovieEntity;
	}

	public void setMovieEntity(List<MovieEntity> movieEntity) {
		MovieEntity = movieEntity;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
