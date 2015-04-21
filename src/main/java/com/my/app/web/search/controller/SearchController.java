package com.my.app.web.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.app.web.search.vo.SearchVo;

@Controller
public class SearchController {
	
	@RequestMapping(value = "/search/search", method = RequestMethod.GET)
	public String search() {
		return "search/search";
	}
	
	@RequestMapping(value = "/search/search1", method = RequestMethod.GET)
	public String search1(@Validated(value = SearchVo.Search1.class) SearchVo vo) {
		return "search/search";
	}
	
	@RequestMapping(value = "/search/search2", method = RequestMethod.GET)
	public String search2(@Validated(value = SearchVo.Search2.class) SearchVo vo) {
		return "search/search";
	}
	
}
