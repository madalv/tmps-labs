package lab2.pizzaChain

import java.lang.Thread.sleep
import lab2.pizzaChain.pizzaFactories.CaliPizzaFactory
import lab2.pizzaChain.pizzaFactories.NYPizzaFactory
import kotlin.random.Random

fun main() {
    while(true) {
        if (Random(System.currentTimeMillis()).nextBoolean())
            NYPizzaFactory.createPizza("cheese")
        else
            CaliPizzaFactory.createPizza("pepperoni")
        sleep(3000)
    }
}