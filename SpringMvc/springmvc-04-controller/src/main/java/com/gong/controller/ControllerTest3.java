package com.gong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c3")
public class ControllerTest3 {
@RequestMapping("t1")
	public String test1(){
		return "test";

	}

}
