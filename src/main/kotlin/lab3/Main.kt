package lab3

import lab3.hometheater.HomeTheaterFacade
import lab3.hometheater.film.Film
import lab3.hometheater.film.Genre
import lab3.hometheater.film.GenreComponent

fun main() {
    val homeTheater = HomeTheaterFacade()
    val film: GenreComponent = Film("Silence of the Lambs", "Greatest movie ever.")
    val film2: GenreComponent = Film("Scream", "Not the greatest movie ever.")

    val genre: GenreComponent = Genre("Horror", "Ooh, scary.")
    val subgenre: GenreComponent = Genre("Slasher", "Blood.")

    subgenre.add(film2)
    genre.add(film)
    genre.add(subgenre)
    genre.print()
    homeTheater.watchFilm(subgenre)

    homeTheater.watchGrandmasTV()
}