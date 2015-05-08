package com.eq.model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name="User_Profile")
public @Data class UserProfile implements Serializable{

	
	private static final long serialVersionUID = -2074675292247736959L;
	@Id
	@Column(name="user_id")
	@GeneratedValue
	private int userId;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="sex")
	private char sex;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="about_me")
	private String aboutMe;
	
	@Column(name="profile_picture")
	private Blob profilePicture;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="user_id")
	@Transient
	private User user;
}
