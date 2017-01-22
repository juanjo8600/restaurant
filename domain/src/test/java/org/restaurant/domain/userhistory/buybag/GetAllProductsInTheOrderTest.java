package org.restaurant.domain.userhistory.buybag;

import org.junit.Test;
import org.restaurant.domain.data.TestProducts;
import org.restaurant.domain.order.Order;

import static org.junit.Assert.assertTrue;

/**
 * Created by juanjosejimenezfernandez on 17/12/16.
 */
public class GetAllProductsInTheOrderTest {

    @Test
    public void getAllProducts() {
        Order order = new Order();
        order.add(TestProducts.PIZZA);
        order.add(TestProducts.BURGUER);
        assertTrue(order.getAllProducts().containsKey(TestProducts.PIZZA) && order.getAllProducts().containsKey(TestProducts.BURGUER) && order.getNumberOfProducts() == 2);
    }

    @Test
    public void getProductQuantity() {
        Order order = new Order();
        order.add(TestProducts.PIZZA);
        order.add(TestProducts.PIZZA);
        order.add(TestProducts.PIZZA);
        order.add(TestProducts.PIZZA);
        order.add(TestProducts.BURGUER);
        order.add(TestProducts.BURGUER);

        assertTrue(order.getProductQuantity(TestProducts.PIZZA) == 4 && order.getProductQuantity(TestProducts.BURGUER) == 2);

    }

    @Test
    public void getProductQuantitytest() {
        Order order = new Order();
        assertTrue(order.getNumberOfProducts() == 0);
    }
}
