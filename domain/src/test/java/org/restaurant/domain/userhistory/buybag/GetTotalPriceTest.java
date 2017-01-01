package org.restaurant.domain.userhistory.buybag;

import org.junit.Before;
import org.junit.Test;
import org.restaurant.domain.data.TestProducts;
import org.restaurant.domain.bag.BuyBag;
import org.restaurant.domain.common.Money;
import org.restaurant.domain.constants.Currency;
import org.restaurant.domain.discount.Discount;
import org.restaurant.domain.discount.FixedDiscount;
import org.restaurant.domain.discount.PercentageDiscount;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

/**
 * Created by juanjosejimenezfernandez on 16/12/16.
 */
public class GetTotalPriceTest {

    public static final double DISCOUNT_PERCENTAGE = 10;
    private static final Money DISCOUNT_FIXED = new Money(new BigDecimal(5.66), Currency.EURO);

    private BuyBag buyBag = new BuyBag();
    private BigDecimal totalPrice = TestProducts.PIZZA.getProductPrice().getAmount().add(TestProducts.BURGUER.getProductPrice().getAmount());

    private Money total = new Money(totalPrice,Currency.EURO);

    @Before
    public void setup() {
        buyBag.add(TestProducts.BURGUER);
        buyBag.add(TestProducts.PIZZA);
    }

    @Test
    public void getTotalPrice() {
        assertTrue(buyBag.getTotalPrice().getAmount().equals(totalPrice.setScale(2, BigDecimal.ROUND_UP)));
    }

    @Test
    public void getTotalPriceWithPercentgeDiscount() {
        Discount discount = new PercentageDiscount(DISCOUNT_PERCENTAGE);
        buyBag.addDiscount(discount);
        assertTrue(buyBag.getTotalPrice().equals(discount.calculateDiscountOnPrice(total)));
    }


    @Test
    public void getTotalPriceWithFixedDiscount() {
        Discount discount = new FixedDiscount(DISCOUNT_FIXED);
        buyBag.addDiscount(discount);
        assertTrue(buyBag.getTotalPrice().equals(discount.calculateDiscountOnPrice(total)));
    }
}
