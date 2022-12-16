package lab4.cafe

import lab4.cafe.iterators.Iterator
import lab4.cafe.menus.DinerMenu
import lab4.cafe.menus.PancakeMenu
import lab4.cafe.order.Command

class Waitress (
    val name: String,
    dinerMenu: DinerMenu,
    pancakeMenu: PancakeMenu
) : Subscriber {
    private val it1 = dinerMenu.createIterator()
    private val it2 = pancakeMenu.createIterator()
    private var slot: Command? = null

    override fun update(item: String) {
        println("Order $item ready - can be picked up...")
    }

    fun takeOrder(order: Command) {
        println("Waitress $name has taken a order")
        slot = order
    }

    fun orderUp() {
        println("Waitress $name has posted the order...")
        slot?.execute()
    }

    fun printMenu() {
        println("----- MENU -----")
        printMenu(it1)
        printMenu(it2)
        println("----- END MENU -----")
    }


    private fun printMenu(it: Iterator) {
        while(it.hasNext()) {
            println(it.next())
        }
    }

    fun printBreakfastMenu() {
        printMenu(it2)
    }
}