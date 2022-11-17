package lab3

import lab3.hometheater.FilmLibrary
import lab3.hometheater.HomeTheaterFacade
import lab3.hometheater.film.Film
import lab3.hometheater.film.Genre
import lab3.hometheater.film.GenreComponent

fun main() {
    val homeTheater = HomeTheaterFacade()
    val filmLibrary = FilmLibrary()

    homeTheater.init()

    homeTheater.stream(filmLibrary.getRandom())

    homeTheater.changeFilm(filmLibrary.getRandom())

    homeTheater.turnOffSystem()

    homeTheater.watchGrandmasTV()

    homeTheater.watchCable()
}