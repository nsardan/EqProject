package com.eq.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="User_log")
public @Data class UserLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6712993814522889323L;
	
	@Id
	@Column(name="user_log_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int userLogId;
	
	@Column(name="user_id")
	@JoinColumn(name="user_id")
	private int userId;
	
	@Column(name="login_time")
	private Date loginTime;
	
	@Column(name="login_success")
	private boolean loginSuccess;
	
	
}
