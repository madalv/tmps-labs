package lab3.hometheater.film

class Genre(
    override val name: String,
    override val description: String
    ) : GenreComponent {

    private val components: MutableList<GenreComponent> = mutableListOf()

    override fun add(compoent: GenreComponent) {
        components.add(compoent)
    }

    override fun remove(compoent: GenreComponent) {
        components.remove(compoent)
    }

    override fun print() {
        println(this.toString())
    }

    override fun toString(): String {
        return "Genre $name: " + components.joinToString(", ", "[", "]")
    }
}