package lab2.pizzaChain.domain.doughs

import lab2.pizzaChain.domain.Cheese
import lab2.pizzaChain.domain.Dough


class ThinCrustDough() : Dough {
    override lateinit var crust: String
    override var name = "Thin crust dough"
    override lateinit var filling: Cheese
}