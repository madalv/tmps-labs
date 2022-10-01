package lab1.shippingStrategy

import java.lang.IllegalArgumentException
import java.math.BigDecimal
import java.util.*

class GlobalShippingStrategy(flatRate: BigDecimal): ShippingStrategy(flatRate) {

    override fun calculateShippingCost(packageWeightKG: Float,
                                       packageHeightCM: Float,
                                       packageLengthCM: Float,
                                       packageWidthCM: Float,
                                       destination: Locale.IsoCountryCode?
    ): BigDecimal {
        // preconditions for arguments
        if (packageWeightKG <= 0f)
            throw java.lang.IllegalArgumentException("packageWeight must be positive and non-zero.")

        if (packageHeightCM <= 0f || packageLengthCM <= 0f || packageWidthCM <= 0)
            throw java.lang.IllegalArgumentException("Package dimensions must be positive and non-zero")

        // DO NOT DO: strengthening preconditions
        if (destination == null)
            throw IllegalArgumentException("Must use valid country code!")

        var shippingCost = BigDecimal.ONE

        // CALCULATE shipping cost

        // postcondition for return value
//        if (shippingCost <= BigDecimal.ZERO)
//            throw java.lang.IllegalArgumentException("Cost out of expected range.")
        return shippingCost
    }
}