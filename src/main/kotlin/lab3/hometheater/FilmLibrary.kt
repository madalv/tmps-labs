package lab3.hometheater

import lab3.hometheater.film.Film
import lab3.hometheater.film.Genre
import lab3.hometheater.film.GenreComponent
import kotlin.random.Random

class FilmLibrary {
    private val library: MutableList<GenreComponent> = mutableListOf()

    init {
        val film: GenreComponent = Film("Silence of the Lambs", "Greatest movie ever.")
        val film2: GenreComponent = Film("Scream", "Not the greatest movie ever.")
        val genre: GenreComponent = Genre("Horror", "Ooh, scary.")
        val subgenre: GenreComponent = Genre("Slasher", "Blood.")

        library.addAll(listOf(film, film2, genre, subgenre))
    }

    fun getRandom(): GenreComponent {
        val index = Random(System.currentTimeMillis()).nextInt(0, library.size)

        return library[index]
    }
}