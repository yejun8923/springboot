package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * @value()기본값지정
 * @autowired -참조할 객체를 자동으로 찾음
 * @qualifier - 유사한 객체가 여러개 있을 때 빈의 이름으로 정확하게 지정해줌
 */


// 다음 나오는 클래스를 빈으로 등록하겠다는 의미
@Component
public class Member {
	@Value("홍길동")
	private String name;
	@Value("의적")
	private String nickname;
	@Autowired
	@Qualifier("printerA")
	private Printer printer;
	
	public Member() {
		
	}
	public Member(String name, String nickname, Printer printer) {
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void print() {
		printer.print("Hello "+ name +"("+nickname+")");
	}
}
