package com.mysite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hell")
	@ResponseBody
	public String hello() {
		return "������";
	}

	@RequestMapping("/quiz")
	@ResponseBody
	public String quiz(){
		return "�����Դϴ�";
	}



}



