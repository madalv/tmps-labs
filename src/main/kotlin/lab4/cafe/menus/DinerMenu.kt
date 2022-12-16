package lab4.cafe.menus

import lab4.cafe.iterators.DinerMenuIterator
import lab4.cafe.iterators.Iterator

class DinerMenu: IterableMenu {
    private val menuItems = mutableListOf<MenuItem>()

    init {
        menuItems.addAll(listOf(
            MenuItem("BLT", false),
            MenuItem("Coffee",true),
            MenuItem("Burger",false),
            MenuItem("Fish",false)
        ))
    }

    override fun createIterator(): Iterator {
        return DinerMenuIterator(menuItems)
    }


}