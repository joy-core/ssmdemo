package com.test.register;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.register.model.User;
import com.test.register.serviceImpl.UserService;

@Controller
@RequestMapping(value="/register")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="demo")
	public String getUserById(HttpServletRequest request,Model model){
		int id = Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserById(id);
		System.out.println(user.toString());
		model.addAttribute("user",user);
		return "demo";
	}
}
