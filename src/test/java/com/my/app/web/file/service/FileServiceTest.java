package com.my.app.web.file.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.app.web.common.service.CommonService;
import com.my.app.web.file.vo.FileVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring/*-context.xml"})
public class FileServiceTest {
	
	@InjectMocks
	private FileService fileService;
	
	@Mock
	private CommonService commonService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFileUpload() {
		FileVo vo = new FileVo();
		vo.setId("1");
		vo.setName("파일입니다.");
		vo.setFile(new MockMultipartFile("file", "파일입니다.".getBytes()));
		
		this.fileService.fileUpload(vo);
	}
	
}
