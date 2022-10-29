package lab2.pizzaChain.ingredientFactories

import lab2.pizzaChain.IngredientFactory
import lab2.pizzaChain.domain.*
import lab2.pizzaChain.domain.cheeses.ParmegianoCheese
import lab2.pizzaChain.domain.doughBuilders.CaliStyleDoughBuilder
import lab2.pizzaChain.domain.doughs.ThinCrustDough
import lab2.pizzaChain.domain.pepperonis.ClassicPepperoni
import lab2.pizzaChain.domain.sauces.ClassicMarinaraSauce

class CaliIngredientFactory: IngredientFactory {

    override val doughBuilder = CaliStyleDoughBuilder()

    override fun getCheese(): Cheese {
        return ParmegianoCheese()
    }

    override fun getSauce(): Sauce {
        return ClassicMarinaraSauce()
    }

    override fun getDough(): Dough {
        return doughBuilder
            .setCrust("filled")
            .setFilling(ParmegianoCheese())
            .setName("Cali-style dough")
            .makeDough()
    }

    override fun getPepperoni(): Pepperoni {
        return ClassicPepperoni()
    }
}