package lab4.cafe.iterators

import lab4.cafe.menus.MenuItem

class PancakeHouseMenuIterator(
    private val menuItems: Map<Int, MenuItem>
): Iterator {
    private val itemsList = menuItems.values.toList()
    private var position: Int = 0
        set(value) { field = if (value >= 0) value else 0 }

    override fun hasNext(): Boolean {
        return position < menuItems.size
    }

    override fun next(): MenuItem {
        val item = itemsList[position]
        position += 1
        return item
    }

    override fun getItem(pos: Int): MenuItem {
        return if (pos < menuItems.size) itemsList[pos] else itemsList[0]
    }
}