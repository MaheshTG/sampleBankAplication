package com.app.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.model.Account;

@Repository
public interface BankRepository extends JpaRepository<Account, Integer>{

}
