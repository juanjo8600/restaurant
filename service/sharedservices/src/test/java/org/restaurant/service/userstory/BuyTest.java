package org.restaurant.service.userstory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.restaurant.domain.order.Order;
import org.restaurant.repositoy.Bill.Bill;
import org.restaurant.repositoy.Bill.BillRepository;
import org.restaurant.service.buy.dto.BuyOperationResult;
import org.restaurant.service.buy.OrderService;
import org.restaurant.service.buy.OrderServiceImpl;

import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class BuyTest {

    @InjectMocks
    private OrderService orderService = new OrderServiceImpl();

    @Mock
    private BillRepository billRepository;

    public void setUp(){
        when(billRepository.save(any(Bill.class))).thenReturn(new Bill());
    }


}
