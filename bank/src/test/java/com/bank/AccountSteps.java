package com.bank;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps {
    private Account account;
    
    @Given("a new account with balance {int}")
    public void createAccount(int initBalance){
        account = new Account();
        account.deposit(initBalance);
    }

    @When("I deposit {int} from the account")
    public void depositIntoAccount(int amount){
        account.deposit(amount);
    }

    @When("I withdraw {int} from the account")
    public void withdrawFromAccount(int amount){
        account.withdraw(amount);
    }

    @Then("the balance should be {int}")
    public void verifyBalance(int expectedBalance){
        assertEquals(expectedBalance, account.getBalance());
    }
}
