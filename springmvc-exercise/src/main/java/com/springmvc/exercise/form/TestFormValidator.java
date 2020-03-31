package com.springmvc.exercise.form;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class TestFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return TestForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		TestForm form = (TestForm) target;
		if (form.getId() == 100 && form.getName().equals("tom")) {
			errors.rejectValue("multiError", "testForm.tom100error");
		}
	}
}