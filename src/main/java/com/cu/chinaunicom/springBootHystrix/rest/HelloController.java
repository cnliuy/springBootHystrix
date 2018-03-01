package com.cu.chinaunicom.springBootHystrix.rest;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/**
	 * http://127.0.0.1:6080/hello
	 * */
    @RequestMapping(value = "hello", method = RequestMethod.GET)    
    public Object hello(HttpServletRequest request) {
    	int millis  = 10000;
    	Date date = new Date(); 
    	try {
    		System.out.println("等待中。。。");
			Thread.sleep(millis);
			System.out.println("OK。。。 ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
    	return  "helloWorld "+date;    	
    }

}
