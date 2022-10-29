package lab2.pizzaChain

import lab2.pizzaChain.domain.*
import lab2.pizzaChain.domain.builders.DoughBuilder

interface IngredientFactory {
    val doughBuilder: DoughBuilder
    fun getCheese(): Cheese
    fun getSauce(): Sauce
    fun getDough(): Dough
    fun getPepperoni(): Pepperoni
}