package com.cu.chinaunicom.springBootHystrix.rest;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloController {
	
	/**
	 * 访问链接:
	 * 		http://127.0.0.1:6080/hello
	 * 
	 * 
	 * */
	//code change 2
	@HystrixCommand(fallbackMethod = "error", commandProperties = {
	            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10001")
	})
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"}) 
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
	
	
	
	
	/**
	 * 注意此函数中的入参 须与 hello()的一致
	 *    才能被调用
	 * 
	 * */
	//code change 3
	public Object error(HttpServletRequest request) {
		Date daterr = new Date(); 
		return "hello error "+daterr;
	}
    

}
