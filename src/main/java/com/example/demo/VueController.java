package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VueController {

	@RequestMapping("/")
	public String index() {
		//访问后输入http://localhost:9001/hystrix.stream
		return "forward:/hystrix";
	}
	
}
