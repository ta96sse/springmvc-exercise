package com.springmvc.exercise.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HelloController {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String indexGet() {
		System.out.println("GETでのリクエスト");
		return "index";
	}

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public String indexPost(HttpServletRequest request, WebRequest webRequest, Model model) {
		System.out.println("POSTでのリクエスト");
		request.setAttribute("req1", request.getParameter("param1"));
		webRequest.setAttribute("req2", webRequest.getParameter("param1"), WebRequest.SCOPE_REQUEST);
		model.addAttribute("req3", "Model Attribute Date");
		return "index";
	}
}
