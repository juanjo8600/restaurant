package org.restaurant.domain.userhistory.buybag;

import org.junit.Test;
import org.restaurant.domain.data.TestProducts;
import org.restaurant.domain.bag.BuyBag;

import static org.junit.Assert.assertTrue;

/**
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public class GetAllProductsInTheBuyBagTest {

    @Test
    public void getAllProducts() {
        BuyBag buyBag = new BuyBag();
        buyBag.add(TestProducts.PIZZA);
        buyBag.add(TestProducts.BURGUER);
        assertTrue(buyBag.getAllProducts().containsKey(TestProducts.PIZZA) && buyBag.getAllProducts().containsKey(TestProducts.BURGUER) && buyBag.getNumberOfProducts() == 2);
    }

    @Test
    public void getProductQuantity() {
        BuyBag buyBag = new BuyBag();
        buyBag.add(TestProducts.PIZZA);
        buyBag.add(TestProducts.PIZZA);
        buyBag.add(TestProducts.PIZZA);
        buyBag.add(TestProducts.PIZZA);
        buyBag.add(TestProducts.BURGUER);
        buyBag.add(TestProducts.BURGUER);

        assertTrue(buyBag.getProductQuantity(TestProducts.PIZZA) == 4 && buyBag.getProductQuantity(TestProducts.BURGUER) == 2);

    }

    @Test
    public void getProductQuantitytest() {
        BuyBag buyBag = new BuyBag();
        assertTrue(buyBag.getNumberOfProducts() == 0);
    }
}
