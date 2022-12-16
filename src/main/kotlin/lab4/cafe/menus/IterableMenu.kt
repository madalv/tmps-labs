package lab4.cafe.menus

import lab4.cafe.iterators.Iterator

interface IterableMenu {
    fun createIterator(): Iterator
}