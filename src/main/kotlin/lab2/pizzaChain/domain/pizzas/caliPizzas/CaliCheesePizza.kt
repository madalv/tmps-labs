package lab2.pizzaChain.domain.pizzas.caliPizzas

import lab2.pizzaChain.IngredientFactory
import lab2.pizzaChain.domain.Cheese
import lab2.pizzaChain.domain.Dough
import lab2.pizzaChain.domain.Pizza
import lab2.pizzaChain.domain.Sauce

class CaliCheesePizza(override val ingredientFactory: IngredientFactory): Pizza {
    override val name = "Cali-style Cheese Pizza"
    override lateinit var cheese: Cheese
    override lateinit var dough: Dough
    override lateinit var sauce: Sauce

    override fun prepare() {
        cheese = ingredientFactory.getCheese()
        dough = ingredientFactory.getDough()
        sauce = ingredientFactory.getSauce()
    }


}