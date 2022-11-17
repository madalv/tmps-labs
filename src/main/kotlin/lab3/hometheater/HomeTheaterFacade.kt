package lab3.hometheater

import lab3.hometheater.film.*
import lab3.hometheater.subsystem.*
import lab3.hometheater.subsystem.remotes.Remote
import lab3.hometheater.subsystem.remotes.UniversalRemote
import lab3.hometheater.subsystem.tvs.RetroTVAdapter
import lab3.hometheater.subsystem.tvs.SonyTV
import lab3.hometheater.subsystem.tvs.TV

class HomeTheaterFacade {
    private val amp: Amplifier = Amplifier()
    private val projector: Projector = Projector()
    private val player: StreamingPlayer = StreamingPlayer()
    private val popcornMachine: PopcornMachine = PopcornMachine()
    private lateinit var tv: TV
    private lateinit var remote: Remote

    fun init() {
        tv = SonyTV(1)
        remote = UniversalRemote(tv)
    }

    fun stream(component: GenreComponent) {

        popcornMachine.on()
        popcornMachine.makePopcorn("classic")
        popcornMachine.off()

        remote.on()

        projector.on()
        projector.connect(tv)
        projector.setWideMode()

        amp.on()
        amp.connect(tv)
        amp.setSound(10)

        player.on()
        player.connect(tv)
        player.play(component)

        println("-------------------------")
    }

    fun turnOffSystem() {
        player.off()
        amp.off()
        projector.off()
        remote.off()
        println("-------------------------")
    }

    fun changeFilm(component: GenreComponent) {
        player.pause()
        player.play(component)
        println("-------------------------")
    }

    fun watchCable() {
        player.off()
        amp.off()
        projector.off()
        remote.on()
        remote.setChannel(13)
    }

    fun watchGrandmasTV() {
        tv = RetroTVAdapter(1)
        tv.turnOn()
        tv.tuneChannel(12)
        tv.turnOff()
        println("-------------------------")
    }

}