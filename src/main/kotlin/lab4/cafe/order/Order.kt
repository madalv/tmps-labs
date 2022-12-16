package lab4.cafe.order

import lab4.cafe.Chef

class Order(
    private val chef: Chef,
    private val item: String
): Command {

    override fun execute() {
        chef.prepareFood(item)
    }
}