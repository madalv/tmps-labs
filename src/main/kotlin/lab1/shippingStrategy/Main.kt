package lab1.shippingStrategy

import java.math.BigDecimal

fun main() {
    val shipStrategy1 = ShippingStrategy(BigDecimal(1.5))
    val shipStragyGlobal = GlobalShippingStrategy(BigDecimal(1.7))

    // can't substitute subtype GlobalShippingStrategy for ShippingStrategy
    shipStrategy1.calculateShippingCost(1.2f, 1.5f, 0.3f, 23.3f, null)
    shipStragyGlobal.calculateShippingCost(1.2f, 1.5f, 0.3f, 23.3f, null)
}