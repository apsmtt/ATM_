package org.example

class DepositTransaction: Transaction {
    override fun process() {
        println("Enter deposit amount: ")
        val deposit = readln().toDouble()
        accountBalance += deposit
        println("$deposit$ has been inserted")
        println("Account balance: $accountBalance$")
    }
}