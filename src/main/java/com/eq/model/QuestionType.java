package com.eq.model;

import java.io.Serializable;

import lombok.Data;

public @Data class QuestionType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7196051773790552362L;
	private int questionTypeId;
	private String questionType;
}
