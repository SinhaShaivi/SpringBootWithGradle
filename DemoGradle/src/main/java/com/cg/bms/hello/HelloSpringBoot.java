package com.cg.bms.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//System.out.println("hi");
//testing this

@RestController
public class HelloSpringBoot {
    @RequestMapping("/hello")
	public String helloSpring()
	{
		System.out.println("Hello World");
	    return "Welcome!!";
	}
}
