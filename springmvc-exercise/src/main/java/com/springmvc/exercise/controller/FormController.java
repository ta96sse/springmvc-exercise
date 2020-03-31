package com.springmvc.exercise.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.exercise.form.TestForm;
import com.springmvc.exercise.form.TestFormValidator;

@Controller
public class FormController {
	@Autowired
	TestFormValidator testFormValidator;

	@ModelAttribute
	public TestForm setUpForm() {
		return new TestForm();
	}

	@InitBinder
	public void validatorBinder(WebDataBinder binder) {
		binder.addValidators(testFormValidator);
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String showForm(Model model) {
		// フォームクラス生成
		TestForm form = new TestForm();
		// Modelにセット
		model.addAttribute("testForm", form);
		model.addAttribute("message", "FORMの練習");
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String showForm(@ModelAttribute @Valid TestForm form, BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println("入力エラー");
			model.addAttribute("message", "入力エラー");
		} else {
			model.addAttribute("message", "ID : " + form.getId() + " & name : " + form.getName());
		}
		return "form";
	}
}
