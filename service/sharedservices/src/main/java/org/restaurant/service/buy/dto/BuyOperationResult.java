package org.restaurant.service.buy.dto;

import org.restaurant.domain.order.Order;

/**
 * Buy operation result DTO.
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
public class BuyOperationResult {

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
