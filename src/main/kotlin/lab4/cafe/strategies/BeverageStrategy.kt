package lab4.cafe.strategies

class BeverageStrategy: Strategy() {
    override fun prepare(item: String) {
        println("Preparing beverage $item...")
    }

    override fun prepareIngredients() {
        println("Getting water, leaves, and coffee beans ready...")
    }
}