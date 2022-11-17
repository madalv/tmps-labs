package lab3.hometheater.subsystem.tvs

class SonyTV(
    override var currentChannel: Int
    ) : TV {
    override fun turnOn() {
        println("Turning on Sony TV...")
    }

    override fun turnOff() {
        println("Turning off Sony TV...")
    }

    override fun tuneChannel(channel: Int) {
        currentChannel = channel
        println("Changed to channel $channel")
    }
}