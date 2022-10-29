package lab2.pizzaChain.domain.pizzas.caliPizzas

import lab2.pizzaChain.IngredientFactory
import lab2.pizzaChain.domain.*

class CaliPepperoniPizza(override val ingredientFactory: IngredientFactory): Pizza {
    override val name = "Cali-style Pepperoni Pizza"
    override lateinit var cheese: Cheese
    override lateinit var dough: Dough
    override lateinit var sauce: Sauce
    private lateinit var meat: Pepperoni

    override fun prepare() {
        cheese = ingredientFactory.getCheese()
        dough = ingredientFactory.getDough()
        sauce = ingredientFactory.getSauce()
        meat = ingredientFactory.getPepperoni()
    }

    override fun getContents(): String {
        return super.getContents() + ", ${meat.name}"
    }

}