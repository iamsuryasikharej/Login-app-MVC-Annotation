package com.login.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@org.springframework.stereotype.Controller
public class LoginActionController implements Controller {

	@RequestMapping("/loginaction")
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if(name.equals("surya") && pwd.equals("surya")) {
		return new ModelAndView("success");
		}
		else
			return new ModelAndView("failure");

	}

}
