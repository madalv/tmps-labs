package lab2.pizzaChain.domain.doughBuilders

import lab2.pizzaChain.domain.Dough
import lab2.pizzaChain.domain.builders.DoughBuilder
import lab2.pizzaChain.domain.doughs.ThinCrustDough

class NYStyleDoughBuilder: DoughBuilder() {
    override fun makeDough(): Dough {
        val dough = ThinCrustDough()
        dough.name = name
        dough.crust = crust
        dough.filling = filling

        return dough
    }
}