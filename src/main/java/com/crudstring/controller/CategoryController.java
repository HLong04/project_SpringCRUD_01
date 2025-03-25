package com.crudstring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	@RequestMapping("/Html")
	public String index() {
		return "Html/index";
	}
}
