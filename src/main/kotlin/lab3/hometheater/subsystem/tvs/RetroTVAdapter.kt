package lab3.hometheater.subsystem.tvs

class RetroTVAdapter(
    override var currentChannel: Int
    ) : TV {

    private val retroTV: RetroTV = RetroTV()

    override fun turnOn() {
        retroTV.goUpToTV()
        retroTV.pressButton("ON")
    }

    override fun turnOff() {
        retroTV.goUpToTV()
        retroTV.pressButton("OFF")
    }

    override fun tuneChannel(channel: Int) {
        retroTV.goUpToTV()
        retroTV.turnRandomWheel(channel)
    }
}