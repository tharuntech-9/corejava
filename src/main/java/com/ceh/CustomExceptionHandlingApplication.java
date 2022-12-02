package com.ceh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ceh.dto.AccountDto;
import com.ceh.entities.Account;
import com.ceh.exception.NullPointerException;
import com.ceh.service.AccountService;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.ceh.repositories" })
@EntityScan(basePackages = { "com.ceh.entities" })
public class CustomExceptionHandlingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CustomExceptionHandlingApplication.class, args);
		AccountService service = context.getBean(AccountService.class);
		AccountDto accountDetails = service.getAccountDetails(9);
		System.out.println(accountDetails);
		
	}

}
