package org.restaurant.webservice;

import org.restaurant.webservice.buybag.buy.BuyBagRequest;
import org.restaurant.webservice.buybag.buy.BuyBagResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by juanjose on 13/1/17.
 */
@WebService
public interface BuyBagService {

    @WebMethod
    BuyBagResponse buyBag(BuyBagRequest buyBagResquest);
}
