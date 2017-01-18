package org.restaurant.webservice;

import org.restaurant.webservice.buybag.buy.BuyBagRequest;
import org.restaurant.webservice.buybag.buy.BuyBagResponse;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

/**
 * Created by juanjose on 13/1/17.
 */
@WebService(targetNamespace = "org.restaurant.webservice") public interface BuyBagService {

   @WebMethod @WebResult(name = "BuyBagResponse", targetNamespace = "org.restaurant.webservice") @ResponseWrapper(targetNamespace = "org.restaurant.webservice", className = "org.restaurant.webservice.buybag.buy.BuyBagResponse") BuyBagResponse buyBag(
	  @WebParam(name = "buyBagRequest", targetNamespace = "org.restaurant.webservice") BuyBagRequest buyBagResquest);

   @WebMethod @Oneway void buyBagTest(
	  @WebParam(name = "buyBagRequest", targetNamespace = "org.restaurant.webservice") BuyBagRequest buyBagResquest);
}
