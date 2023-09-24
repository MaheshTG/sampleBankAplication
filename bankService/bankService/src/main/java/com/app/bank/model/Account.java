package com.app.bank.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="account_details")
public class Account {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountId;
	private String accountName;
	private String accountSurName;
	private String city;
	private String email;
	private String password;
	private String phNum;
	private String accoutNum;
	private Date accountDate;
	private Integer balance;
}
