package org.example

class ATMFacade(
    private val deposit: DepositTransaction,
    private val withdraw: WithdrawTransaction,
    private val balanceRetrieval: BalanceRetrievalTransaction
) {
    private fun setTransactionMethod(transaction: Transaction){
        transaction.process()
    }

    fun userChoice(option: TransactionOption){
        when(option){
            TransactionOption.DEPOSIT -> {
                setTransactionMethod(deposit)
            }
            TransactionOption.WITHDRAW-> {
                setTransactionMethod(withdraw)
            }
            TransactionOption.BALANCE -> {
                setTransactionMethod(balanceRetrieval)
            }

            TransactionOption.NONE -> {
                println("Please enter 1,2 or 3")
            }
        }
    }
}
