package com.FeeManagement.controllersFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
//	UserService userService;
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv =null;
//		User user = userService.validateUser(login)
		return mv;
	}
}
