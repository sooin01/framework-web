package com.my.app.web.file.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(value = {"classpath*:spring/*-context.xml"})
public class FileControllerTest {
	
	@InjectMocks
	FileController fileController;
	
	MockMvc mockMvc;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(this.fileController).build();
	}
	
	@Test
	public void testUpload() throws Exception {
		MockMultipartFile file = new MockMultipartFile("file", "file.txt", "multipart/form-data", "content".getBytes());
		
		this.mockMvc.perform(
				fileUpload("/file/upload")
				.file(file)
				.param("id", "1")
				.param("name", "파일입니다."))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
}
