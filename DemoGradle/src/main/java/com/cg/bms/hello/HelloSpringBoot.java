package com.cg.bms.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
@RestController
public class HelloSpringBoot {
    @RequestMapping("/hello")
	public String helloSpring()
	{
		System.out.println("Hello World");
	    return "Welcome!!";
	}
}
