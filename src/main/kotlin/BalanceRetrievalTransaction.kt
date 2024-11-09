package org.example

class BalanceRetrievalTransaction: Transaction {
    override fun process() {
        println("Account balance: $accountBalance$")
    }
}