package org.restaurant.webservice;

import org.restaurant.webservice.order.buy.OrderRequest;
import org.restaurant.webservice.order.buy.OrderResponse;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

/**
 * Created by juanjose on 13/1/17.
 */
@WebService(targetNamespace = "org.restaurant.webservice") public interface OrderWebService {

   @WebMethod @WebResult(name = "OrderResponse", targetNamespace = "org.restaurant.webservice")
   OrderResponse doOrder(
	  @WebParam(name = "orderRequest", targetNamespace = "org.restaurant.webservice") OrderRequest orderRequest);

   @WebMethod @Oneway void doOrderTest(
	  @WebParam(name = "orderRequest", targetNamespace = "org.restaurant.webservice") OrderRequest orderRequest);
}
