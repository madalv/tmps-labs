package lab2.pizzaChain.domain.builders

import lab2.pizzaChain.domain.Cheese
import lab2.pizzaChain.domain.Dough

abstract class DoughBuilder {
    lateinit var name: String
    lateinit var crust: String
    lateinit var filling: Cheese

    fun setName(name: String) = apply {this.name = name}
    fun setCrust(crust: String) = apply {this.crust = crust}
    fun setFilling(filling: Cheese) = apply { this.filling = filling }
    abstract fun makeDough(): Dough
}