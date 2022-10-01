package lab1.transactionProcessor

class Transaction(private val name: String) {
    // other fields
    override fun toString(): String {
        return name
    }
}