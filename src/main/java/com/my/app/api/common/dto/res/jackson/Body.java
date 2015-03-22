package com.my.app.api.common.dto.res.jackson;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Body {

	@JacksonXmlProperty
	@JacksonXmlElementWrapper(useWrapping = false)
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
