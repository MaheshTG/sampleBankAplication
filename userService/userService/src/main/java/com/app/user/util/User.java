package com.app.user.util;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userSurName;
	private String city;
	private String email;
	private String password;
	private String phNum;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurName() {
		return userSurName;
	}
	public void setUserSurName(String userSurName) {
		this.userSurName = userSurName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhNum() {
		return phNum;
	}
	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
	
	
}
