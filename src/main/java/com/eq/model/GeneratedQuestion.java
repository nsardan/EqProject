package com.eq.model;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

public @Data class GeneratedQuestion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5546579564402145077L;
	private int generatedQuestionId;
	private String questionTypeTitle;
	private String uid;
	private int questionId;
	private Date creationDate;
	private int orderNo;
	private String createdBy;

}
