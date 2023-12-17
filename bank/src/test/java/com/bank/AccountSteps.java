package com.bank;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;

public class AccountSteps {
    private Account account;
    
    @Given("a new account with balance {int}")
    public void createAccount(int initBalance){
        account = new Account();
        account.deposit(initBalance);
    }

    @When("I deposit {int} from the account")
    public void withdrawFromAccount(int amount){
        account.withdraw(amount);
    }

    @When("I withdraw {int} from the account")
    public void depositIntoAccount(int amount){
        account.deposit(amount);
    }

    @Then("the balance should be {int}")
    public void verifyBalance(int expectedBalance){
        assertEquals(expectedBalance, account.getBalance());
    }
}
