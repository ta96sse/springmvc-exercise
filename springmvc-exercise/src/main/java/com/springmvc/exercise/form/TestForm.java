package com.springmvc.exercise.form;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@SuppressWarnings("serial")
public class TestForm implements Serializable {
	@NotNull(message = "必須入力です。")
	@Range(min = 1, max = 100, message = "入力サイズを範囲外です。")
	private int id;
	@NotEmpty(message = "必須入力です。")
	private String name;
	// 相関チェックエラーメッセージ用のフィールド
	private String multiError;

	public String getMultiError() {
		return multiError;
	}

	public void setMultiError(String multiError) {
		this.multiError = multiError;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}