package com.my.app.web.date.vo;

import org.hibernate.validator.constraints.NotBlank;

import com.my.app.web.common.vo.CommonVO;

public class DateVO extends CommonVO {

	private static final long serialVersionUID = -1355731768086219952L;

	@NotBlank
	private String id;
	@NotBlank
	private String title;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
