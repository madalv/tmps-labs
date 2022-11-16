package lab3.hometheater.film

class Film(
    override val name: String,
    override val description: String
    ) : GenreComponent {

    override fun add(compoent: GenreComponent) {
        println("Can't add component to film.")
    }

    override fun remove(compoent: GenreComponent) {
        println("Can't remove component from film.")
    }

    override fun print() {
        println(this.toString())
    }

    override fun toString(): String {
        return "{$name: \"$description\"}"


    }
}
