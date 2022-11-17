package lab3.hometheater.subsystem.tvs

interface TV {

    var currentChannel: Int

    fun turnOn()

    fun turnOff()

    fun tuneChannel(channel: Int)
}