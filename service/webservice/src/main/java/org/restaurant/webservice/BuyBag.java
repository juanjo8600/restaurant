package org.restaurant.webservice;

import org.restaurant.webservice.buybag.buy.BuyBagRequest;
import org.restaurant.webservice.buybag.buy.BuyBagResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by jj.jimenez on 10/01/2017.
 */
@WebService(endpointInterface = "org.restaurant.webservice.BuyBagService") public class BuyBag
   implements BuyBagService {

   @WebMethod @Override public BuyBagResponse buyBag(BuyBagRequest buyBagResquest) {

	  return new BuyBagResponse();
   }
}
