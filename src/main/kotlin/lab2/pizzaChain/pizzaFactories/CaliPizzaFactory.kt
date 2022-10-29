package lab2.pizzaChain.pizzaFactories

import lab2.pizzaChain.domain.Pizza
import lab2.pizzaChain.PizzaFactory
import lab2.pizzaChain.domain.pizzas.caliPizzas.CaliCheesePizza
import lab2.pizzaChain.domain.pizzas.caliPizzas.CaliPepperoniPizza
import lab2.pizzaChain.ingredientFactories.CaliIngredientFactory

object CaliPizzaFactory: PizzaFactory {

    override val ingredientFactory  = CaliIngredientFactory()
    override fun createPizza(type: String): Pizza {
        lateinit var pizza: Pizza
        when(type) {
            "cheese" -> pizza = CaliCheesePizza(ingredientFactory)
            "pepperoni" -> pizza = CaliPepperoniPizza(ingredientFactory)
        }
        pizza.prepare()
        pizza.bake(25)
        pizza.box()
        println(pizza.getContents())
        return pizza
    }
}