package com.ceh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceh.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
