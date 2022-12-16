package lab4.cafe.menus

import lab4.cafe.iterators.Iterator
import lab4.cafe.iterators.PancakeHouseMenuIterator

class PancakeMenu: IterableMenu {
    private val menuItems = mutableMapOf<Int, MenuItem>()

    init {
        menuItems.putAll(mapOf(
            Pair(0, MenuItem("Honey Pancakes",true)),
            Pair(1, MenuItem("Chocolate Pancakes", true)),
            Pair(2, MenuItem("Cinnamon Waffles", true)),
            Pair(3, MenuItem("Tea", true))
        ))
    }

    override fun createIterator(): Iterator {
        return PancakeHouseMenuIterator(menuItems)
    }
}