package org.restaurant.webservice.order.buy;

import org.restaurant.domain.order.Order;
import org.restaurant.service.buy.dto.BuyOperationResult;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement(namespace = "org.restaurant.webservice")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderResponse implements Serializable {

    private String orderId;

    @XmlTransient
    private Order order;

    public OrderResponse() {
    }

    public OrderResponse(BuyOperationResult buyOperationResult) {
        this.order = buyOperationResult.getOrder();
    }

    public String getOrderId() {
        return orderId;
    }
}
