package lab2.pizzaChain.domain.doughBuilders

import lab2.pizzaChain.domain.Dough
import lab2.pizzaChain.domain.builders.DoughBuilder
import lab2.pizzaChain.domain.doughs.ThickCrustDough

class CaliStyleDoughBuilder: DoughBuilder() {
    override fun makeDough(): Dough {
        val dough = ThickCrustDough()
        dough.name = name
        dough.crust = crust
        dough.filling = filling

        return dough
    }
}