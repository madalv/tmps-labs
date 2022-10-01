package lab1.transactionProcessor.providers

import lab1.transactionProcessor.interfaces.TransactionDataProvider
import java.util.stream.Stream

class StreamTransactionDataProvider(private val stream: Stream<String>) : TransactionDataProvider {

    override fun getTransactionData(): List<String> {
        val data = mutableListOf<String>()

       stream.forEach { line ->
           data.add(line)
       }

        return data
    }
}