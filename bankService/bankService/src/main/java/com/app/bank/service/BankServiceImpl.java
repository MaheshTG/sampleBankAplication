package com.app.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bank.repo.BankRepository;
import com.app.bank.repo.TransactionRepository;

@Service
public class BankServiceImpl implements BankService{
	
	@Autowired
	private BankRepository bankRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
}
