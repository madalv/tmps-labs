package lab3.hometheater.film

interface GenreComponent {
    val name: String
    val description: String

    fun add(compoent: GenreComponent)
    fun remove(compoent: GenreComponent)
    fun print()
}