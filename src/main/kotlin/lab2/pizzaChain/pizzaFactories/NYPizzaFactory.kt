package lab2.pizzaChain.pizzaFactories

import lab2.pizzaChain.domain.Pizza
import lab2.pizzaChain.PizzaFactory
import lab2.pizzaChain.domain.pizzas.nyPizzas.NYCheesePizza
import lab2.pizzaChain.domain.pizzas.nyPizzas.NYPepperoniPizza
import lab2.pizzaChain.ingredientFactories.NYIngredientFactory

object NYPizzaFactory: PizzaFactory {

    override val ingredientFactory  = NYIngredientFactory()
    override fun createPizza(type: String): Pizza {
        lateinit var pizza: Pizza
        when(type) {
            "cheese" -> pizza = NYCheesePizza(ingredientFactory)
            "pepperoni" -> pizza = NYPepperoniPizza(ingredientFactory)
        }
        pizza.prepare()
        pizza.bake(20)
        pizza.box()
        println(pizza.getContents())
        return pizza
    }
}