package org.restaurant.service.userstory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.restaurant.domain.bag.BuyBag;
import org.restaurant.repositoy.Bill.Bill;
import org.restaurant.repositoy.Bill.BillRepository;
import org.restaurant.service.buy.BuyOperationResult;
import org.restaurant.service.buy.BuyService;
import org.restaurant.service.buy.BuyServiceImpl;

import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class BuyTest {

    @InjectMocks
    private BuyService buyService = new BuyServiceImpl();

    @Mock
    private BillRepository billRepository;

    public void setUp(){
        when(billRepository.save(any(Bill.class))).thenReturn(new Bill());
    }

    @Test
    public void buyWithoutError(){
       BuyOperationResult buyOperationResult = buyService.buy(new BuyBag());
        assertFalse(buyOperationResult.haveErrors());
    }
}
