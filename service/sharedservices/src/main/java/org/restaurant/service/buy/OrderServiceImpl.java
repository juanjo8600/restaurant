package org.restaurant.service.buy;

import org.restaurant.repository.model.Bill;
import org.restaurant.repository.bill.BillRepository;
import org.restaurant.service.buy.dto.BuyOperationRequest;
import org.restaurant.service.buy.dto.BuyOperationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private BillRepository billRepository;

    /**
     * Buy operation.
     *
     * @param buyOperationRequest buy order to buy.
     * @return Buy operation result with information about buy.
     */
    @Transactional
    public BuyOperationResult buy(BuyOperationRequest buyOperationRequest) {

        Bill bill = new Bill();
        billRepository.save(bill);

        return new BuyOperationResult();
    }
}
