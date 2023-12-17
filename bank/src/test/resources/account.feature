Feature: Bank Account Transactions

    Scenario: Create an account and deposit money
        Given a new account with balance 100
        When I deposit 50 from the account
        Then the balance should be 150

    Scenario: Create an account and withdraw money
        Given a new account with balance 100
        When I withdraw 20 from the account
        Then the balance should be 80