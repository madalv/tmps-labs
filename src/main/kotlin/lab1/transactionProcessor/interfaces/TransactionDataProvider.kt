package lab1.transactionProcessor.interfaces

interface TransactionDataProvider {
    fun getTransactionData(): List<String>
}