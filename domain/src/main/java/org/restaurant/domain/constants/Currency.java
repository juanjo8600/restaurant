package org.restaurant.domain.constants;

/**
 * Currency.
 * Created by juanjosejimenezfernandez on 16/12/16.
 */
public enum Currency {
    EURO("EUR"), NOT("NOT");

    private String currencyCode;

    Currency(String currency) {
        this.currencyCode = currency;
    }
}
