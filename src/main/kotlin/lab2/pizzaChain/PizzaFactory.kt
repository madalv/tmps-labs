package lab2.pizzaChain

import lab2.pizzaChain.IngredientFactory
import lab2.pizzaChain.domain.Pizza


// factory method pattern
interface PizzaFactory {
    val ingredientFactory: IngredientFactory
    fun createPizza(type: String): Pizza
}