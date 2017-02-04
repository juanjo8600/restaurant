package org.restaurant.webservice.products;

import org.restaurant.service.products.GetAllProductsService;
import org.restaurant.service.products.dto.GetAllProductsResult;
import org.restaurant.webservice.products.model.GetProductsResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * Created by juanjose on 4/2/17.
 */
@WebService(endpointInterface = "org.restaurant.webservice.products.GetProductsService", targetNamespace = "org.restaurant.webservice", serviceName = "GetProductsWebService")
public class GetProductsWebserviceImpl implements GetProductsService {

    @Autowired
    private GetAllProductsService getAllProductsService;

    @Override
    public GetProductsResponse getAllProducts() {
        GetAllProductsResult getAllProductsResult = getAllProductsService.getAllProducts();
        return null;
    }
}
