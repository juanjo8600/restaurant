package org.restaurant.service.products.dto;

import org.restaurant.domain.product.Product;

import java.util.List;

/**
 * Created by juanjose on 3/2/17.
 */
public class GetAllProductsResult {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
