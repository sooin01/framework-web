package com.my.app.web.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.my.app.web.file.vo.FileVo;

@Service
public class CommonService {

	private static final Logger logger = LoggerFactory.getLogger(CommonService.class);
	
	public int fileUpload(FileVo vo) {
		logger.info("CommonService : {}", vo);
		return 0;
	}
	
}
