package org.restaurant.service.buy.dto;

import org.restaurant.domain.order.Order;

/**
 * Buy operation request DTO.
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
public class BuyOperationRequest {

    private Order order;

    public BuyOperationRequest(Order order){
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
