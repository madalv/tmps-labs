package lab3.hometheater.subsystem.tvs

class RetroTV {

    fun goUpToTV() {
        println("Going up to the TV like in the good ol' days.")
    }

    fun turnRandomWheel(channel: Int) {
        println("Turning some unspecified wheel to $channel, hope it's what we need.")
    }

    fun pressButton(btn: String) {
        println("Pressing button $btn.")
    }
}