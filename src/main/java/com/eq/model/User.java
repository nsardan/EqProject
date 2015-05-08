package com.eq.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="User")
public @Data class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -277933161424751560L;
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column(name="is_locked")
	private Boolean isLocked;
	
	@OneToOne(cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private UserProfile userProfile;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Set<UserLog> userLogs;
	
	
}
