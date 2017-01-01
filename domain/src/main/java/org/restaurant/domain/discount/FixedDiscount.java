package org.restaurant.domain.discount;

import org.restaurant.domain.common.Money;

/**
 * Fixed discount.
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public class FixedDiscount extends Discount {

    private Money discountFixed;

    /**
     * Constructor.
     *
     * @param discountFixed fixed discount money.
     */
    public FixedDiscount(Money discountFixed) {
        super();
        this.discountFixed = discountFixed;
    }

    /**
     * Calculate discount on price.
     *
     * @param price price.
     * @return price with applied discount.
     */
    public Money calculateDiscountOnPrice(Money price) {
        Money discountedPrice = new Money();
        discountedPrice.add(price);
        discountedPrice.subtract(discountFixed);
        return discountedPrice;
    }
}
