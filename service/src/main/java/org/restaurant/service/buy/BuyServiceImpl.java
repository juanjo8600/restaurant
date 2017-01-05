package org.restaurant.service.buy;

import org.restaurant.domain.bag.BuyBag;
import org.restaurant.repositoy.Bill.Bill;
import org.restaurant.repositoy.Bill.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
public class BuyServiceImpl implements BuyService {

    @Autowired
    private BillRepository billRepository;

    /**
     * Buy operation.
     *
     * @param buyBag buy bag to buy.
     * @return Buy operation result with information about buy.
     */
    @Transactional
    @Override
    public BuyOperationResult buy(BuyBag buyBag) {

        Bill bill = new Bill();
        billRepository.save(bill);

        return new BuyOperationResult(false, "");
    }
}
