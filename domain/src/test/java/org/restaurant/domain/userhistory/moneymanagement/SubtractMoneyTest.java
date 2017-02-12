package org.restaurant.domain.userhistory.moneymanagement;

import org.junit.Test;
import org.restaurant.domain.common.Money;
import org.restaurant.domain.constants.Currency;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

/**
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public class SubtractMoneyTest {

    public static final BigDecimal PRICE_ONE = new BigDecimal(12.45);
    public static final BigDecimal PRICE_TWO = new BigDecimal(10.11);

    @Test
    public void subtractSameCurrency() {
        Money money1 = new Money(PRICE_ONE, Currency.EURO);
        Money money2 = new Money(PRICE_TWO, Currency.EURO);
        money1 = money1.subtract(money2);
        assertTrue(money1.getAmount().equals(PRICE_ONE.subtract(PRICE_TWO).setScale(2, BigDecimal.ROUND_UP)));
    }
}
