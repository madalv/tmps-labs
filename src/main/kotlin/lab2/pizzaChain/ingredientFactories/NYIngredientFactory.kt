package lab2.pizzaChain.ingredientFactories

import lab2.pizzaChain.IngredientFactory
import lab2.pizzaChain.domain.Cheese
import lab2.pizzaChain.domain.Dough
import lab2.pizzaChain.domain.Pepperoni
import lab2.pizzaChain.domain.Sauce
import lab2.pizzaChain.domain.cheeses.MozzarellaCheese
import lab2.pizzaChain.domain.doughBuilders.NYStyleDoughBuilder
import lab2.pizzaChain.domain.pepperonis.SpicyPepperoni
import lab2.pizzaChain.domain.sauces.PlumMarinaraSauce

class NYIngredientFactory: IngredientFactory {

    override val doughBuilder = NYStyleDoughBuilder()

    override fun getCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun getSauce(): Sauce {
        return PlumMarinaraSauce()
    }

    override fun getDough(): Dough {
        return doughBuilder
            .setCrust("filled")
            .setFilling(MozzarellaCheese())
            .setName("NY-style dough")
            .makeDough()
    }

    override fun getPepperoni(): Pepperoni {
        return SpicyPepperoni()
    }
}