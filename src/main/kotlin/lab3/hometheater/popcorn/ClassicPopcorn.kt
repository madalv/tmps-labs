package lab3.hometheater.popcorn

class ClassicPopcorn(
    override val description: String
    ) : Popcorn {

    override fun computePrepTime(): Long {
        return 500L
    }

}