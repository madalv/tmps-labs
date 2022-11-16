package lab3.hometheater.popcorn.decorators

import lab3.hometheater.popcorn.Popcorn
import lab3.hometheater.popcorn.PopcornDecorator

class CaramelDecorator(
    override val wrappedPopcorn: Popcorn
    ) : PopcornDecorator {

    override val description: String
        get() = wrappedPopcorn.description + ", with caramel"

    override fun computePrepTime(): Long {
        return wrappedPopcorn.computePrepTime() + 300L
    }

    fun smell() {
        println("Smells sweet.")
    }
}