package lab1.transactionProcessor

import lab1.transactionProcessor.parsers.BasicTransactionParser
import lab1.transactionProcessor.processors.SimpleTransactionProcessor
import lab1.transactionProcessor.providers.StreamTransactionDataProvider
import lab1.transactionProcessor.storages.H2TransactionStorage

val strings = listOf("TID1121", "TID2124", "TID1102")

fun main() {

    val simpleProcessor =  SimpleTransactionProcessor(
        StreamTransactionDataProvider(strings.stream()),
        BasicTransactionParser(),
        H2TransactionStorage()
    )

    val processorClient = TransactionProcessorClient(simpleProcessor)

    processorClient.transactionProcessor.processTransactions()
}