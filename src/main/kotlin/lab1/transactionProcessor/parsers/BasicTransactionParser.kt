package lab1.transactionProcessor.parsers

import lab1.transactionProcessor.Transaction
import lab1.transactionProcessor.interfaces.TransactionParser

class BasicTransactionParser: TransactionParser {

    override fun parse(list: List<String>): List<Transaction> {
        val transactions = mutableListOf<Transaction>()
        for (string in list) {
            // validate transaction
            // map string to transaction
            // etc
            val transaction = Transaction(string)
            println("$transaction parsed from line $string.")
            transactions.add(transaction)
        }
        return transactions
    }
}