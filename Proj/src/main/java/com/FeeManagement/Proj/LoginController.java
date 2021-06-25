package com.FeeManagement.Proj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public void LoginCheck() {
		System.out.println("Login sucess");
	}
}
