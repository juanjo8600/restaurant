package org.restaurant.domain.product;

import org.restaurant.domain.common.Money;

/**
 * Product.
 * Created by juanjosejimenezfernandez on 16/12/16.
 */
public class Product {
    private String code;
    private String productName;
    private Money productPrice;

    /**
     * Constructor.
     *
     * @param code  product code.
     */
    public Product(String code) {
        this.code = code;
    }

    /**
     * Constructor.
     *
     * @param code  product code.
     * @param name  product name.
     * @param price product price.
     */
    public Product(String code, String name, Money price) {
        this.code = code;
        this.productName = name;
        this.productPrice = price;
    }

    /**
     * Get product price.
     *
     * @return product price.
     */
    public Money getProductPrice() {
        return productPrice;
    }

    /**
     * Get product code.
     *
     * @return product code.
     */
    public String getCode() {
        return code;
    }
}
