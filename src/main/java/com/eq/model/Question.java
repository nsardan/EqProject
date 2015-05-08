package com.eq.model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import lombok.Data;

public @Data class Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4660763313382661330L;
	private int questionId;
	private int classLevelId;
	private int subjectId;
	private int questionTypeId;
	private String difficultyLevel;
	private String frequency;
	private int chapterId;
	private Blob question;
	private Date creationDate;
	private Date modificationDate;
	private int versionNumber;
	private String createdBy;
	private String modifiedBy;

}
