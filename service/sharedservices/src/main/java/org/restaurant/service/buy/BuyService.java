package org.restaurant.service.buy;

import org.restaurant.domain.bag.BuyBag;

/**
 * Buy service.
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
public interface BuyService {

    /**
     * Buy operation.
     *
     * @param buyBag buy bag to buy.
     * @return Buy operation result with information about buy.
     */
    BuyOperationResult buy(BuyBag buyBag);
}
