package lab4.cafe.strategies

abstract class Strategy {
    fun prepareRecipe(item: String) {
        washHands()
        prepareIngredients()
        prepare(item)
        washDishes()
    }

    private fun washDishes() {
        println("Turning on dish washing machine...")
    }

    abstract fun prepare(item: String)

    abstract fun prepareIngredients()

    private fun washHands() {
        println("Chef thouroughly washing his hands...")
    }
}

