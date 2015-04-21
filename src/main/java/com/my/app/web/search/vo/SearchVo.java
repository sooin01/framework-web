package com.my.app.web.search.vo;

import org.hibernate.validator.constraints.NotBlank;

public class SearchVo {

	@NotBlank(groups = { SearchVo.Search1.class, SearchVo.Search2.class })
	String id;
	@NotBlank(groups = SearchVo.Search2.class)
	String name;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static interface Search1 {
	}
	
	public static interface Search2 {
	}

}
