package lab2.pizzaChain.domain

import lab2.pizzaChain.IngredientFactory

interface Pizza {
    val ingredientFactory: IngredientFactory
    val name: String
    val cheese: Cheese
    val dough: Dough
    val sauce: Sauce

    fun prepare()

    fun bake(time: Int) {
        println("Baking for $time minutes.")
    }
    fun box() {
        println("Putting $name in box.")
    }

    fun getContents(): String {
        return "Ing: ${cheese.name}, ${dough.name}, ${sauce.name}"
    }

}