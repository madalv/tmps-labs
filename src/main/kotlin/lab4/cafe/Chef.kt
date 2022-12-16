package lab4.cafe

import lab4.cafe.strategies.BeverageStrategy
import lab4.cafe.strategies.FoodStrategy
import lab4.cafe.strategies.Strategy


class Chef(
    private val waitresses: MutableList<Subscriber>
) {
    private var preparingStrategy: Strategy = FoodStrategy()

    private fun setStrategy(s: Strategy) {
        preparingStrategy = s
    }

    fun prepareFood(item: String) {
        when (item) {
            "Tea", "Coffee" -> {
                setStrategy(BeverageStrategy())
            }
            else -> {
                setStrategy(FoodStrategy())
            }
        }
        cook(item)
        notifyWaitresses(item)
    }

    private fun cook(item: String) {
        preparingStrategy.prepareRecipe(item)
    }

    private fun notifyWaitresses(item: String) {
        for (w in waitresses) {
            w.update(item)
        }
    }

    fun addWaitress(w: Waitress) {
        waitresses.add(w)
    }

    fun fireWaitress(w: Waitress) {
        waitresses.remove(w)
    }
}