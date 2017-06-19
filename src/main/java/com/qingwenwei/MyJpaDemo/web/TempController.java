package com.qingwenwei.MyJpaDemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
	
	@RequestMapping("/")
    public String home() {
        return "Hello World";
    }
	
}
