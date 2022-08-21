package com.study.springboot;

// 커맨드 객체
// http요청 파라미터의 이름으로 클래스에 세터 메서드를 만들고 이 클래스의 객체를 메서드의
// 파라미터 값으로 넣어주면 스프링은 요청 파라미터의 값을 커맨드 객체에 담는다.

public class Member {

	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
