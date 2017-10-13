package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	//返回到index.jsp	
	@RequestMapping(value="/flowRegistry.do")
	public String hello(String userName,Model model){
		System.out.println(userName);
		model.addAttribute("helloworld","hello world");
		return "index";
	}
}
