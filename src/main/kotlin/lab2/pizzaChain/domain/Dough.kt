package lab2.pizzaChain.domain

interface Dough {
    val name: String
    var filling: Cheese
    var crust: String
}