package lab1.transactionProcessor.interfaces

import lab1.transactionProcessor.Transaction

interface TransactionStorage {
    fun save(transactions: List<Transaction>)
}