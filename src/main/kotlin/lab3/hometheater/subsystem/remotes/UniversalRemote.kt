package lab3.hometheater.subsystem.remotes

import lab3.hometheater.subsystem.tvs.TV

class UniversalRemote(
    override val tv: TV
    ) : Remote() {

        fun nextChannel() {
            tv.tuneChannel(tv.currentChannel + 1)
        }
}