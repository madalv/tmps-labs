package lab3.hometheater.subsystem

import lab3.hometheater.subsystem.tvs.TV
import kotlin.properties.Delegates

class Amplifier {

    private lateinit var tv: TV
    private var sound = 0
    fun on() {
        println("Turning amp on...")
    }

    fun connect(tv: TV) {
        println("Connecting amp to TV.")
        this.tv = tv
    }

    fun off() {
        println("Turning amp off...")
    }

    fun setSound(sound: Int) {
        this.sound = sound
        println("Amp sound to $sound.")
    }
}