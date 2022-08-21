package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.springboot.dao.ISimpleBbsDao;



@Controller
public class MyController {
	
	@Autowired
	ISimpleBbsDao dao;
	
	@RequestMapping("/")
	public  String root() throws Exception {
		return "redirect:list";
		// url로 / 가 호출되면 url이 자동으로 /list로 연결되게 만드는 방법이다.
	}
	
	
	// 게시판의 리스트를 출력하기 위해 dao의 listdao() 메서드를 호출하여 리턴값을 model 변수에 담음
	
	@RequestMapping("/list")
	public String userlistPage(Model model) {
		model.addAttribute("list",dao.listDao());
		return "list";
	}
	
	// 개별 게시글을 보기 위해 dao의 viewDao 메서드를 호출 하여 리턴값을 model 변수에 담음
	
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto",dao.viewDao(sId));
		
		return "view";
	}
	
	//입력폼을 가진 jsp 파일 호출
	
	@RequestMapping("writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	//폼의 입력값을 파라미터로 받아 dao의 writedao 매ㅔ서드를 호출하여 데이터베이스에 인설트 한다
	@RequestMapping("/write")
	public String write(Model model, HttpServletRequest request) {
		dao.writeDao(request.getParameter("writer"),
				request.getParameter("title"),
				request.getParameter("content"));
		
		return "redirect:list";
	}
	
	//파라미터로 넘어온 값을 이용해 dao의 deleteDao 메서드를 호출해 데이터베이스에서 게시글을 delete 한다
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
		dao.deleteDao(request.getParameter("id"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/updateForm")
	public String updateForm(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto",dao.viewDao(sId));
		
		return "updateForm";
	}
	
	@RequestMapping("/update")
	public String update(Model model, HttpServletRequest request) {
		dao.updateDao(request.getParameter("id"),
				request.getParameter("writer"),
				request.getParameter("title"),
				request.getParameter("content"));
		
		return "redirect:list";
	}

}
