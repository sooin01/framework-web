package com.my.app.web.file.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.app.web.common.service.CommonService;
import com.my.app.web.file.vo.FileVo;

@Service
public class FileService {
	
	private static final Logger logger = LoggerFactory.getLogger(FileService.class);
	
	@Autowired
	private CommonService commonService;
	
	public int fileUpload(FileVo vo) {
		logger.info("FileService : {}", vo);
		return this.commonService.fileUpload(vo);
	}

}
