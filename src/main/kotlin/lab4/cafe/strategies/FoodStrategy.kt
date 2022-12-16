package lab4.cafe.strategies

class FoodStrategy: Strategy() {
    override fun prepare(item: String) {
        println("Preparing meal $item...")
    }

    override fun prepareIngredients() {
        println("Preparing ingredients to cook meal...")
    }
}