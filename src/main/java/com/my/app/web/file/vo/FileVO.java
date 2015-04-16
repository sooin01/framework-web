package com.my.app.web.file.vo;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import com.my.app.web.common.vo.CommonVO;

@SuppressWarnings("serial")
public class FileVO extends CommonVO {
	
	@NotBlank(groups = {FileVO.Create.class, FileVO.Modify.class})
	private String id;
	
	@NotBlank(groups = {FileVO.Create.class})
	private String name;
	
	private MultipartFile file;

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

	public MultipartFile getFile() {
		return this.file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
