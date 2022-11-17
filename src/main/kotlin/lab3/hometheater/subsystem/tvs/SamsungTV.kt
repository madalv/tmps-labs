package lab3.hometheater.subsystem.tvs

class SamsungTV(
    override var currentChannel: Int
    ) : TV {
    override fun turnOn() {
        println("Turning on Samsung TV...")
    }

    override fun turnOff() {
        println("Turning off Samsung TV...")
    }

    override fun tuneChannel(channel: Int) {
        currentChannel = channel
        println("Changed to channel $channel")
    }
}