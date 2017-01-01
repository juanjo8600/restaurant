package org.restaurant.domain.discount;

import org.restaurant.domain.common.Money;

import java.math.BigDecimal;

/**
 * Percentage discount.
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public class PercentageDiscount extends Discount {
    private double percentage;

    /**
     * Constructor with percentage.
     *
     * @param percentage percentage.
     */
    public PercentageDiscount(double percentage) {
        super();
        this.percentage = percentage;
    }

    /**
     * {@inheritDoc}
     */
    public Money calculateDiscountOnPrice(Money price) {
        BigDecimal divisor = new BigDecimal(1 + percentage / 100);
        BigDecimal discountedQuantity = price.getAmount().divide(divisor, 2, BigDecimal.ROUND_UP);
        return new Money(discountedQuantity, price.getCurrency());
    }
}
