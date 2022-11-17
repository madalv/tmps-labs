package lab3.hometheater.popcorn.decorators

import lab3.hometheater.popcorn.Popcorn
import lab3.hometheater.popcorn.PopcornDecorator

class SaltDecorator(
    override val wrappedPopcorn: Popcorn
    ) : PopcornDecorator {

    override val description: String
        get() = wrappedPopcorn.description + ", with salt"

    override fun computePrepTime(): Long {
        return wrappedPopcorn.computePrepTime() + 100L
    }
}