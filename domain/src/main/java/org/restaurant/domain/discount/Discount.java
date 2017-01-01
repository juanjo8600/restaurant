package org.restaurant.domain.discount;

import org.restaurant.domain.common.Money;

/**
 * Discounts.
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public abstract class Discount {

    /**
     * Calculate discount on price.
     *
     * @param price price.
     * @return price with applied discount.
     */
    public abstract Money calculateDiscountOnPrice(Money price);

}
