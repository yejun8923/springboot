package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication
 * 1. @Configuration
 * 	  - Bean을 생성할 때 Singleton으로 한 번 생성한다.
 * 	  - 각종 설정을 세팅한다.
 * 2. @EnableAutoConfiguration
 * 	  - 스프링 어플리케이션 컨텍스트를 만들 때 자동으로 설정하는 기능을 켠다.
 * 	  - 사용자가 필요할 것 같은 빈을 추측해서 ApplicationContext를 만들 때 필요한 설정을 한다.
 * 3. @ComponentScan
 *    - 지정한 위치 이하에 있는 @Component와 @Configuration이 붙은 클래스를 스캔해서 빈으로 등록한다 
 */
@SpringBootApplication
public class Ex03AnnotationDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex03AnnotationDiApplication.class, args);
	}

}
