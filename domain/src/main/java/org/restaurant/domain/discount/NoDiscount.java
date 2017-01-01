package org.restaurant.domain.discount;

import org.restaurant.domain.common.Money;

/**
 * No discount.
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public class NoDiscount extends Discount {

    /**
     * {@inheritDoc}
     */
    @Override
    public Money calculateDiscountOnPrice(Money price) {
        return price;
    }
}
