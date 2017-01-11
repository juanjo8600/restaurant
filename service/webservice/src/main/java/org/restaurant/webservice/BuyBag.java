package org.restaurant.webservice;

import org.restaurant.webservice.buybag.buy.BuyBagRequest;
import org.restaurant.webservice.buybag.buy.BuyBagResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by jj.jimenez on 10/01/2017.
 */
@WebService public class BuyBag {

   @WebMethod public BuyBagResponse buyBag(BuyBagRequest buyBagResquest) {

	  return new BuyBagResponse();
   }
}
