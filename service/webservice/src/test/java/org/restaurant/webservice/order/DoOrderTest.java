package org.restaurant.webservice.order;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.restaurant.domain.order.Order;
import org.restaurant.service.buy.OrderService;
import org.restaurant.service.buy.dto.BuyOperationRequest;
import org.restaurant.service.buy.dto.BuyOperationResult;
import org.restaurant.webservice.OrderWebServiceImpl;
import org.restaurant.webservice.order.shopping.cart.ShoppingCart;
import org.restaurant.webservice.order.buy.OrderRequest;
import org.restaurant.webservice.order.buy.OrderResponse;
import org.restaurant.webservice.order.product.ProductRequest;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by jj.jimenez on 05/01/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class DoOrderTest {

    public static final long ORDER_ID = 120L;
    // TODO use spring DI???
    @InjectMocks
    private OrderWebServiceImpl orderWebService;

    @Mock
    private OrderService orderService;

    @Test
    public void doOrderServiceTest() {
        BuyOperationResult buyOperationResult = new BuyOperationResult();
        Order orderResult = new Order(ORDER_ID);
        buyOperationResult.setOrder(orderResult);

        when(orderService.buy(any(BuyOperationRequest.class))).thenReturn(buyOperationResult);

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

        OrderResponse orderResponse = orderWebService.doOrder(orderRequest);

        assertTrue(orderResponse.getOrderId() == ORDER_ID);
    }
}
