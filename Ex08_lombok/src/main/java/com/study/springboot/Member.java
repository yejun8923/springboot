package com.study.springboot;

import lombok.Data;

// 롬복(lombok)
// 자바 클래스를 만들때 흔히 만드는 코드들을 어노테이션을 통해 자동으로 만들어주는 유틸리티
// ㄹ라이브러리
// getter,setter 메서드와 toString,equals,hashcode 등의 자주 만드는 메서드를 말한다


@Data
public class Member {

	private String id;
	private String name;
	

	
	
}
