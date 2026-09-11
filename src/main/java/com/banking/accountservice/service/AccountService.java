package com.banking.accountservice.service;

import java.math.BigDecimal;

import com.banking.accountservice.dto.AccountResponse;
import com.banking.accountservice.dto.CreateAccountRequest;

public class AccountService {


    public AccountResponse createAccount(CreateAccountRequest request){
   return null;
    }
    public AccountResponse getAccount(String  accountnumber){
   return null;
    }
    public BigDecimal getBalance(String  accountnumber){
        return null;
    }
    public String blockAccount(String  accountnumber){
        return null;
    }

     public String deductBalance(String  accountnumber, BigDecimal amount){
        return null;
    }
     public String creditBalance(String  accountnumber, BigDecimal amount){
        return null;
    }
    
}
