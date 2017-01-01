package org.restaurant.domain.bag;

import org.restaurant.domain.common.Money;
import org.restaurant.domain.discount.Discount;
import org.restaurant.domain.discount.NoDiscount;
import org.restaurant.domain.product.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Buy bag.
 * Created by juanjosejimenezfernandez on 16/12/16.
 */
public class BuyBag {

    private Map<Product, Integer> productList = new HashMap<>();
    private Discount discount = new NoDiscount();

    /**
     * Add product to the bag.
     *
     * @param product product to add.
     */
    public void add(Product product) {
        productList.merge(product, 1, Integer::sum);
    }

    /**
     * Get total price.
     *
     * @return total price of bag.
     */
    public Money getTotalPrice() {
        Money totalPrice = new Money();
        productList.forEach((product, quantity) -> totalPrice.addNTimes(product.getProductPrice(), quantity));
        return discount.calculateDiscountOnPrice(totalPrice);
    }

    /**
     * Add discount.
     *
     * @param discount discount to add.
     */
    public void addDiscount(Discount discount) {
        this.discount = discount;
    }

    /**
     * Get all product list with quantity.
     *
     * @return all product list with quantity.
     */
    public Map<Product, Integer> getAllProducts() {
        return productList;
    }

    /**
     * Get total of products in the bag.
     *
     * @return total of products in the bag.
     */
    public int getNumberOfProducts() {
        return productList.values().stream().reduce(0, Integer::sum);
    }

    /**
     * Get quantity of a type of product in the bag.
     *
     * @param product Product to check.
     * @return Quantity of this product in the bag.
     */
    public int getProductQuantity(Product product) {
        return productList.getOrDefault(product, 0);
    }
}
