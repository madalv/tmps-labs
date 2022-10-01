package lab1.shippingStrategy


import java.math.BigDecimal
import java.util.Locale.IsoCountryCode

open class ShippingStrategy(flatRate: BigDecimal) {

    // invariant
    protected lateinit var flatRate: BigDecimal

    // precondition for invariant
    init {
        if (flatRate <= BigDecimal.ZERO) throw IllegalArgumentException("flatRate must be positive and non-zero.")
    }

    open fun calculateShippingCost(packageWeightKG: Float,
                                   packageHeightCM: Float,
                                   packageLengthCM: Float,
                                   packageWidthCM: Float,
                                   destination: IsoCountryCode?
                              ): BigDecimal {
        // preconditions for arguments
        if (packageWeightKG <= 0f) 
            throw java.lang.IllegalArgumentException("packageWeight must be positive and non-zero.")
        
        if (packageHeightCM <= 0f || packageLengthCM <= 0f || packageWidthCM <= 0)
            throw java.lang.IllegalArgumentException("Package dimensions must be positive and non-zero")
        
        var shippingCost = BigDecimal.ONE
        
        // CALCULATE shipping cost
        
        // postcondition for return value
        if (shippingCost <= BigDecimal.ZERO)
            throw java.lang.IllegalArgumentException("Cost out of expected range.")
        else println("Cost calculated: $shippingCost. Country code: $destination")

        return shippingCost
    }
}