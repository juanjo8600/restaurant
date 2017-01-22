package org.restaurant.service.buy;

import org.restaurant.service.buy.dto.BuyOperationRequest;
import org.restaurant.service.buy.dto.BuyOperationResult;

/**
 * Order service.
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
public interface OrderService {

    /**
     * Buy order operation.
     *
     * @param buyOperationRequest buy operation request.
     * @return Buy operation result with information about buy.
     */
    BuyOperationResult buy(BuyOperationRequest buyOperationRequest);
}
