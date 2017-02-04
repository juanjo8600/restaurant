package org.restaurant.webservice.products;

import org.restaurant.webservice.products.model.GetProductsResponse;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by juanjose on 4/2/17.
 */
@WebService(targetNamespace = "org.restaurant.webservice") public interface GetProductsService {

    @WebMethod
    @WebResult(name = "GetProductsResponse", targetNamespace = "org.restaurant.webservice")
    GetProductsResponse getAllProducts();
}
