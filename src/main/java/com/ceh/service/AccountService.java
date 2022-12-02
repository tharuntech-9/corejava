package com.ceh.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceh.dto.AccountDto;
import com.ceh.entities.Account;
import com.ceh.exception.NullPointerException;
import com.ceh.repositories.AccountRepository;

import net.bytebuddy.asm.Advice.Return;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;

	@Transactional(readOnly = true)
	public AccountDto getAccountDetails(int accountno) {
		AccountDto dto=new AccountDto();
		 Optional<Account> account = accountRepository.findById(accountno);
		if(account.isPresent()) {
			 Account result= account.get();
			 BeanUtils.copyProperties(result,dto);
			
		}
		else {
			throw new NullPointerException("you don't have any account ..... please create your ACCOUNT....");
		}
		
		return dto;
		
	}
	
	

}
