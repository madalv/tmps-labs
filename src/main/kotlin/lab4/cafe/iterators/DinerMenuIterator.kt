package lab4.cafe.iterators

import lab4.cafe.menus.MenuItem

class DinerMenuIterator(
    private val menuItems: List<MenuItem>
): Iterator {
    private var position: Int = 0
        set(value) { field = if (value >= 0) value else 0 }

    override fun hasNext(): Boolean {
        return position < menuItems.size
    }

    override fun next(): MenuItem {
        val item = menuItems[position]
        position += 1
        return item
    }

    override fun getItem(pos: Int): MenuItem {
        return if (pos < menuItems.size) menuItems[pos] else menuItems[0]
    }
}