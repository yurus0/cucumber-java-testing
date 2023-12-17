package com.bank;

public class AccountSteps {
    private Account account;
    
    public void createAccount(int initBalance){
        account = new Account();
        account.deposit(initBalance);
    }

    public void withdrawFromAccount(int amount){
        account.withdraw(amount);
    }

    public void depositIntoAccount(int amount){
        account.deposit(amount);
    }

    public void verifyBalance(int expectedBalance){
        assertEquals(expectedBalance, account.getBalance());
    }
}
