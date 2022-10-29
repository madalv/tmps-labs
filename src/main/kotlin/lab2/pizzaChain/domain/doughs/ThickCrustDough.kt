package lab2.pizzaChain.domain.doughs

import lab2.pizzaChain.domain.Cheese
import lab2.pizzaChain.domain.Dough

class ThickCrustDough: Dough {
    override lateinit var crust: String
    override var name = "Thick crust dough"
    override lateinit var filling: Cheese
}