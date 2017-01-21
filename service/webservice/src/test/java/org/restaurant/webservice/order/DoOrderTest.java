package org.restaurant.webservice.order;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.restaurant.webservice.Order;
import org.restaurant.webservice.order.shopping.cart.ShoppingCart;
import org.restaurant.webservice.order.buy.OrderRequest;
import org.restaurant.webservice.order.buy.OrderResponse;
import org.restaurant.webservice.order.product.ProductRequest;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jj.jimenez on 05/01/2017.
 */
public class DoOrderTest {

    // TODO use spring DI???
    private Order orderService = new Order();

    @Test
    public void doOrderServiceTest() {
        List<ProductRequest> shoppingCart = new LinkedList<>();
        ProductRequest productRequest2 = new ProductRequest("2", 1);
        shoppingCart.add(productRequest2);
        ProductRequest productRequest5 = new ProductRequest("5", 1);
        shoppingCart.add(productRequest5);
        ProductRequest productRequest1 = new ProductRequest("1", 4);
        shoppingCart.add(productRequest1);
        ShoppingCart order = new ShoppingCart();
        order.setShoppingCart(shoppingCart);

        OrderRequest orderRequest = new OrderRequest(order);

        OrderResponse orderResponse = orderService.doOrder(orderRequest);

        assertTrue(StringUtils.isNotBlank(orderResponse.getOrderId()));
    }
}
