package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @Controller - 다음에 나오는 클래스를 빈으로 등록하겠다는 의미
 */

@Controller
public class MyController {
	
	@Autowired
	Member member1;
	
	@Autowired
	@Qualifier("printerB")
	Printer printer;
	@Autowired
	Member member2;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		
		// 1. member Bean 가져온거 확인
		member1.print();
		
		// 2, PrinterB Bean 가져온거 확인하기
		member1.setPrinter(printer);
		member1.print();
		
		// 3. 싱글톤 확인
		if(member1 == member2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		return "Annotation 사용하기";
	}
}
