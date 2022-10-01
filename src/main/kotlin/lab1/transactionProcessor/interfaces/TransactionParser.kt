package lab1.transactionProcessor.interfaces

import lab1.transactionProcessor.Transaction

interface TransactionParser {
    fun parse(list: List<String>): List<Transaction>
}