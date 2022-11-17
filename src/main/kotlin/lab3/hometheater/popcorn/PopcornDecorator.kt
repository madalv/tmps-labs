package lab3.hometheater.popcorn

interface PopcornDecorator: Popcorn {
    val wrappedPopcorn: Popcorn
}