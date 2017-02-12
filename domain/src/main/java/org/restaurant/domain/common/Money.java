package org.restaurant.domain.common;

import org.restaurant.domain.constants.Currency;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Money class.
 * Created by juanjosejimenezfernandez on 16/12/16.
 */
public class Money {

    private BigDecimal amount;

    private Currency currency;

    /**
     * Default constructor.
     */
    public Money() {
        amount = BigDecimal.ZERO;
        //TODO cambiar currency not
        currency = Currency.NOT;
    }

    /**
     * Constructor with amount and currency.
     *
     * @param amount   amount.
     * @param currency currency.
     */
    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Get amount.
     *
     * @return amount.
     */
    public BigDecimal getAmount() {
        return amount.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Get currency.
     *
     * @return currency.
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Add money.
     *
     * @param money money to add.
     */
    public Money add(Money money) {
        return operate(money, (m1) -> m1.add(money.getAmount()));
    }

    /**
     * Add the money N times.
     *
     * @param money money to add.
     * @param times times to add.
     */
    public Money addNTimes(Money money, int times) {
        return operate(money, (m1) -> m1.add(money.getAmount().multiply(new BigDecimal(times))));
    }

    /**
     * Subtract money.
     *
     * @param money money to subtract.
     */
    public Money subtract(Money money) {
        return operate(money, (m1) -> m1.subtract(money.getAmount()));

    }

    private Money operate(Money money, Function<BigDecimal, BigDecimal> function) {
        Money result = new Money();

        if (this.currency == Currency.NOT) {
            result.currency = money.getCurrency();
        } else {
            result.currency = this.currency;
        }
        if (money.currency.equals(result.currency)) {
            result.amount = function.apply(this.getAmount());
        } else {
            result.amount = this.amount;
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != null ? !getAmount().equals(money.getAmount()) : money.getAmount() != null) return false;
        return currency == money.currency;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
