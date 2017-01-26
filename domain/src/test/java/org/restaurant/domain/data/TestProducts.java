package org.restaurant.domain.data;

import org.restaurant.domain.common.Money;
import org.restaurant.domain.constants.Currency;
import org.restaurant.domain.product.Product;

import java.math.BigDecimal;

/**
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public class TestProducts {

    public static final Product PIZZA = new Product("1", "Pizza", new Money(new BigDecimal(10.86), Currency.EURO));
    public static final Product BURGUER = new Product("2", "Burguer", new Money(new BigDecimal(6.33), Currency.EURO));
}
