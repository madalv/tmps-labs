package lab3.hometheater.subsystem

import lab3.hometheater.subsystem.tvs.TV

class Projector {

    lateinit var tv: TV
    fun on() {
        println("Turning projector on...")
    }

    fun off() {
        println("Turning projector off...")
    }

    fun connect(tv: TV) {
        println("Connecting projector to TV...")
        this.tv = tv
    }

    fun setWideMode() {
        println("Setting projector to wide mode.")
    }
}