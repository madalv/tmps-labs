package lab1.transactionProcessor.storages

import lab1.transactionProcessor.Transaction
import lab1.transactionProcessor.interfaces.TransactionStorage

class H2TransactionStorage: TransactionStorage {
    override fun save(transactions: List<Transaction>) {
        // do stuff
        // save to H2 DB
        println("Transactions $transactions saved to H2 DB." )
    }
}