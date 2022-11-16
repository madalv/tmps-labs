package lab3.hometheater.subsystem

import lab3.hometheater.popcorn.ClassicPopcorn
import lab3.hometheater.popcorn.Popcorn
import lab3.hometheater.popcorn.decorators.CaramelDecorator
import lab3.hometheater.popcorn.decorators.SaltDecorator
import java.lang.Thread.sleep

class PopcornMachine {

    fun on() {
        println("Starting up popcorn machine...")
    }

    fun makePopcorn(type: String): Popcorn {
        lateinit var popcorn: Popcorn
        return when (type) {
            "classic" -> {
                popcorn = SaltDecorator(ClassicPopcorn("Popcorn"))
                println("Time: ${popcorn.computePrepTime()}")
                sleep(popcorn.computePrepTime())
                println("${popcorn.description} done.")
                popcorn
            }
            "sweet" -> {
                popcorn = CaramelDecorator(ClassicPopcorn("Popcorn"))
                println("Time: ${popcorn.computePrepTime()}")
                sleep(popcorn.computePrepTime())
                println("${popcorn.description} done.")
                popcorn
            }
            else -> {
                popcorn = ClassicPopcorn("Popcorn")
                println("Unkown type, making you a classic. Time: ${popcorn.computePrepTime()}")
                sleep(popcorn.computePrepTime())
                println("${popcorn.description} done.")
                popcorn
            }
        }
    }

    fun off() {
        println("Turning off popcorn machine...")
    }

}