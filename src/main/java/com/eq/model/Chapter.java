package com.eq.model;

import java.io.Serializable;

import lombok.Data;

public @Data class Chapter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2138884694393792214L;
	private int chapterId;
	private int classLevelId;
	private int subjectId;
	private int chapterNumber;
	private String chapterName;
}
