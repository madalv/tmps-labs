package lab3.hometheater

import lab3.hometheater.film.*
import lab3.hometheater.subsystem.*
import lab3.hometheater.subsystem.tvs.ModernTV
import lab3.hometheater.subsystem.tvs.RetroTV
import lab3.hometheater.subsystem.tvs.RetroTVAdapter

class HomeTheaterFacade {
    private val amp: Amplifier = Amplifier()
    private val tuner: Tuner = Tuner()
    private val player: StreamingPlayer = StreamingPlayer()
    private lateinit var tv: TV
    private val popcornMachine: PopcornMachine = PopcornMachine()

    fun watchFilm(component: GenreComponent) {
        tv = ModernTV()
        if (component is Film) {
            println("Setting system up to watch... ${component.name}.")
        } else {
            println("Setting system up to watch... the ${component.name} genre playlist.")
        }

        popcornMachine.on()
        popcornMachine.makePopcorn("classic")
        popcornMachine.off()

        println("-------------------------")
    }

    fun watchGrandmasTV() {
        tv = RetroTVAdapter()
        tv.turnOn()
        tv.changeChannel()
        tv.turnOff()
        println("-------------------------")
    }

}