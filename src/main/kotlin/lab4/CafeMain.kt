package lab4

import lab4.cafe.Chef
import lab4.cafe.Waitress
import lab4.cafe.menus.DinerMenu
import lab4.cafe.menus.PancakeMenu
import lab4.cafe.order.Order

fun main() {
    val dinerMenu = DinerMenu()
    val pancakeMenu = PancakeMenu()

    val waitress1 = Waitress("Claire", dinerMenu, pancakeMenu)
    val waitress2 = Waitress("Natalie", dinerMenu, pancakeMenu)
    val chef = Chef(mutableListOf(waitress1, waitress2))
    waitress1.printMenu()

    val order1 = Order(chef, "BLT")
    val order2 = Order(chef, "Tea")

    waitress1.takeOrder(order1)
    waitress1.orderUp()

    println("--------")

    waitress2.takeOrder(order2)
    waitress2.orderUp()
}