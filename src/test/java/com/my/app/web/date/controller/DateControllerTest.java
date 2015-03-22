package com.my.app.web.date.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(value = {"classpath*:spring/*-context.xml"})
public class DateControllerTest {
	
	@InjectMocks
	DateController dateController;
	
	MockMvc mockMvc;
	
	@Autowired
	MockHttpSession session;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(this.dateController).build();
	}

	@Test
	public void test1() throws Exception {
		this.mockMvc.perform(
				get("/date").sessionAttr("aaa", "111"))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void test2() throws Exception {
		this.session.setAttribute("aaa", "222");
		
		this.mockMvc.perform(
				get("/date").session(this.session))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
	@Test
	public void test3() throws Exception {
		Map<String, Object> sessionMap = new HashMap<>();
		sessionMap.put("aaa", "333");
		
		this.mockMvc.perform(
				get("/date").sessionAttrs(sessionMap))
				.andDo(print())
				.andExpect(status().isOk());
	}
	
}
