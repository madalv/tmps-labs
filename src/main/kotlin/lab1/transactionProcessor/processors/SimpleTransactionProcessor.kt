package lab1.transactionProcessor.processors

import lab1.transactionProcessor.interfaces.TransactionDataProvider
import lab1.transactionProcessor.interfaces.TransactionParser
import lab1.transactionProcessor.interfaces.TransactionProcessor
import lab1.transactionProcessor.interfaces.TransactionStorage

class SimpleTransactionProcessor (
    private val provider: TransactionDataProvider,
    private val parser: TransactionParser,
    private val storage: TransactionStorage
) : TransactionProcessor {
    override fun processTransactions() {
        val data = provider.getTransactionData()
        val trades = parser.parse(data)
        storage.save(trades)
    }
}