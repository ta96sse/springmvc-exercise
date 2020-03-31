package com.springmvc.exercise.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class SessionController {

	@RequestMapping("/session/start")
	public String sessionScope1(HttpSession session, WebRequest webRequest) {
		// セッションに"session1"のキーにデータ"httpSession"を格納
		session.setAttribute("session1", "httpSession");
		// セッションに"session2"のキーにデータ"webRequest"を格納
		webRequest.setAttribute("session2", "webRequest",
				WebRequest.SCOPE_SESSION);

		return "session";
	}

	@RequestMapping("/session/active")
	public String sessionScope2() {
		return "session";
	}

	@RequestMapping("/session/clear")
	public String sessionScope3(HttpSession session) {
		session.invalidate();
		return "session";
	}
}