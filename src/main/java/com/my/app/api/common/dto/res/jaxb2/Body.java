package com.my.app.api.common.dto.res.jaxb2;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlRootElement(name = "Body")
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

	@XmlElement(name = "MovieEntity")
	List<MovieEntity> movieEntity;

	public List<MovieEntity> getMovieEntity() {
		return movieEntity;
	}

	public void setMovieEntity(List<MovieEntity> movieEntity) {
		this.movieEntity = movieEntity;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
