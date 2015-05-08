package com.eq.model;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

public @Data class GeneratedPaper implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2831256729295019123L;
	private int generatedPaperId;
	private String uid;
	private String generatedQuestionUid;
	private int orderNo;
	private String paperTitle;
	private Date creationDate;
	private String createdBy;
}
