package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링 com.cos.blog이하를 스캔해서 모든파일을 메모리에 new 하는 것은 아니구
@RestController  
public class BlogControllerTest {
    // http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1> 안녕하세요! 웹페이지 입니다. </h1>";
	}
}
