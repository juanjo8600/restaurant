package org.restaurant.domain.userhistory.moneymanagement;

import org.junit.Test;
import org.restaurant.domain.common.Money;
import org.restaurant.domain.constants.Currency;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

/**
 * Created by juanjosejimenezfernandez on 16/12/16.
 */
public class AddMoneyTest {

    public static final Money ADDITION_RESULT_SAME_CURRENCY = new Money(new BigDecimal(6), Currency.EURO);
    public static final Money ADDITION_RESULT_DIFFERENT_CURRENCY = new Money(new BigDecimal(2), Currency.EURO);

    @Test
    public void addMoneySameCurrencyTest() {
        Money twoEuro = new Money(new BigDecimal(2), Currency.EURO);
        Money forEuro = new Money(new BigDecimal(4), Currency.EURO);

        Money addition = new Money();
        addition.add(twoEuro);
        addition.add(forEuro);

        assertTrue(ADDITION_RESULT_SAME_CURRENCY.equals(addition));

    }

    @Test
    public void addMoneyDifferentCurrencyTest() {
        Money twoEuro = new Money(new BigDecimal(2), Currency.EURO);
        Money forEuro = new Money(new BigDecimal(4), Currency.NOT);

        Money addition = new Money();
        addition.add(twoEuro);
        addition.add(forEuro);

        assertTrue(ADDITION_RESULT_DIFFERENT_CURRENCY.equals(addition));

    }
}
