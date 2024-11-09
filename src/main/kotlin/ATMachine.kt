package org.example

class ATMachine {
    fun start(){
        welcomeClient()
        transaction()
    }

    private fun welcomeClient(){
        println("----Welcome----")
        println("1.Deposit\n2.Withdraw\n3.Balance")
    }

    private fun transaction(){

        var deposit = DepositTransaction()
        var withdraw = WithdrawTransaction()
        var balanceRetrieval = BalanceRetrievalTransaction()

        val atmFacade = ATMFacade(
            deposit = deposit,
            withdraw = withdraw,
            balanceRetrieval = balanceRetrieval
        )
        print("Enter option: ")
        val option = readln().toInt()
        when(option){
            1 -> {
                atmFacade.userChoice(option = TransactionOption.DEPOSIT)
            }
            2 -> {
                atmFacade.userChoice(option = TransactionOption.WITHDRAW)
            }
            3 -> {
                atmFacade.userChoice(option = TransactionOption.BALANCE)
            }
            else -> {
                atmFacade.userChoice(option = TransactionOption.NONE)
            }
        }
    }
}