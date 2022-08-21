package com.study.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "Model & View";
	}
	
	// addAttribute map의 put와 같은 기능을 하며 이를 통해 해당 모델에 원하는 속성과 
	// 그것에 대한 값을 주어 전달할 뷰에 데이터를 보낼 수 있음
	@RequestMapping("/test1")
	public String test1(Model model) {
		model.addAttribute("name1", "홍길동");
		model.addAttribute("name2", "장발장");
		return "test1";
	}
	
	@RequestMapping("/mv")
	public ModelAndView test2() {
		// 데이터 와 뷰를 동시에 설정이 가능
		ModelAndView mv = new ModelAndView();
		List<String> list= new ArrayList<>();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		mv.addObject("lists", list);
		mv.addObject("ObjectTest", "테스트입니다");
		mv.addObject("name", "홍길동");
		mv.setViewName("view/myView");
		
		return mv;
	}
}
