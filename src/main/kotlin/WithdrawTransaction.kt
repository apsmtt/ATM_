package org.example

class WithdrawTransaction: Transaction {
    override fun process() {
        println("Select Cash: ")
        println("$10 $20\n$30 $40\n other..")
        val withdraw = readln().toDouble()
        accountBalance -= withdraw
        println("Take your cash $withdraw$")
    }
}