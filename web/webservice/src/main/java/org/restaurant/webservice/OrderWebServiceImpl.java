package org.restaurant.webservice;


import org.restaurant.domain.order.Order;
import org.restaurant.service.buy.OrderService;
import org.restaurant.service.buy.dto.BuyOperationRequest;
import org.restaurant.service.buy.dto.BuyOperationResult;
import org.restaurant.webservice.order.buy.OrderRequest;
import org.restaurant.webservice.order.buy.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * Created by jj.jimenez on 10/01/2017.
 */
@WebService(endpointInterface = "org.restaurant.webservice.OrderWebService", targetNamespace = "org.restaurant.webservice", serviceName = "OrderWebService")
public class OrderWebServiceImpl
        implements OrderWebService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderResponse doOrder(OrderRequest orderRequest) {

        Order order = new Order();

        orderRequest.getShoppingCart().getShoppingCart().stream().forEach((p) -> order.add(p.getProductCode(), p.getQuantity()));

        BuyOperationRequest buyOperationRequest = new BuyOperationRequest(order);

        BuyOperationResult buyOperationResult = orderService.buy(buyOperationRequest);

        return new OrderResponse(buyOperationResult);
    }

    @Override
    public void doOrderTest(OrderRequest buyBagResquest) {
    }
}
