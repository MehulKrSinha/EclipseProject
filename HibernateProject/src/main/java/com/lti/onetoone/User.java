package com.lti.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetails2")
/*
 * DEPT
 * deptno dname loc
 * 
 *  userid  username  email  age  pno(FK) 
 *  101     jack      jac..  22   888
 */
public class User {
	
	@Id
	@GeneratedValue //autogenerated
	private int userId;
	
	@Column(name="uname",length=20)
	private String username;
	
	@Column(name="email")
	private String emailAddress;
	
	private int age;

	@OneToOne
	Passport passport;
	
	
	
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
