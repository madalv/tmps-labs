package lab3.hometheater.subsystem.remotes

import lab3.hometheater.subsystem.tvs.TV

abstract class Remote {
    abstract val tv: TV

    fun on() {
        tv.turnOn()
    }

    fun off() {
        tv.turnOff()
    }

    fun setChannel(channel: Int) {
        tv.tuneChannel(channel)
    }
}