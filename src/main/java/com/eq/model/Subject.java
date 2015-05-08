package com.eq.model;

import java.io.Serializable;

import lombok.Data;

public @Data class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -513828431776109948L;
	private int subjectId;
	private String subject;
	
}
