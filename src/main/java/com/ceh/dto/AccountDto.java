package com.ceh.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountDto {
	
	protected int accountno;
	protected String accountholdername;
	protected String accounttype;
	protected double balance;
}
