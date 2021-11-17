package com.hcl.springweb;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView processLogin(ServletRequest request) {

		ModelAndView mav = new ModelAndView();

		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");

		if (name.equals("Raaja") && pwd.equals("Raani")) {
			mav.setViewName("success");
		} else {
			mav.setViewName("failure");
		}

		return mav;
	}

}
