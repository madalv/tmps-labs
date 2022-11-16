package lab3.hometheater.subsystem.tvs

import lab3.hometheater.subsystem.TV

class RetroTVAdapter: TV {

    private val retroTV: RetroTV = RetroTV()

    override fun turnOn() {
        retroTV.goUpToTV()
        retroTV.pressButton("ON")
    }

    override fun turnOff() {
        retroTV.goUpToTV()
        retroTV.pressButton("OFF")
    }

    override fun changeChannel() {
        retroTV.goUpToTV()
        retroTV.turnRandomWheel()
    }
}