package com.atmecs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	
	@RequestMapping("/first")
	public String getTemplate()
	{
		return "first";
		
	}
	
}
