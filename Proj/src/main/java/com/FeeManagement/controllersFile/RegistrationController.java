package com.FeeManagement.controllersFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.FeeManagement.ServiceFile.UserService;
import com.FeeManagement.entityFile.Student;
import com.FeeManagement.entityFile.User;

@Controller
public class RegistrationController {
	
		@Autowired
		public UserService userService;
		
		@RequestMapping(value="/register", method= RequestMethod.GET)
		public ModelAndView showRegister(HttpServletRequest req, HttpServletResponse res) {
				
			ModelAndView mav = new ModelAndView("register");
			mav.addObject("student",new Student());
			
			return mav;
			
		}
		
		@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
		public ModelAndView addUser(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("student") Student student) {
			userService.register(student);
			
			return new ModelAndView("welcome", "username", student.getUserName());
			
		}
}
