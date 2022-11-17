package lab3.hometheater.subsystem

import lab3.hometheater.film.Film
import lab3.hometheater.film.GenreComponent
import lab3.hometheater.subsystem.tvs.TV

class StreamingPlayer {
    lateinit var tv: TV

    fun on() {
        println("Turning player on...")
    }

    fun connect(tv: TV) {
        println("Connecting streaming player to TV...")
        this.tv = tv
    }

    fun pause() {
        println("Pausing current film...")
    }

    fun play(component: GenreComponent) {
        if (component is Film) {
            println("Starting to play ... ${component.name}.")
        } else {
            println("Starting to play ... the ${component.name} genre playlist.")
        }
    }

    fun off() {
        println("Turning player off...")
    }
}