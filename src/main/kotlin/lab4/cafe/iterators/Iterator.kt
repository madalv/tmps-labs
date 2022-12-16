package lab4.cafe.iterators

import lab4.cafe.menus.MenuItem

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem
    fun getItem(pos: Int): MenuItem
}