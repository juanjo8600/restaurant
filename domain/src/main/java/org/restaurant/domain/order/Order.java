package org.restaurant.domain.order;

import org.restaurant.domain.common.Money;
import org.restaurant.domain.discount.Discount;
import org.restaurant.domain.discount.NoDiscount;
import org.restaurant.domain.product.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Buy order.
 * Created by juanjosejimenezfernandez on 16/12/16.
 */
public class Order {

    private Map<Product, Integer> shoppingCart = new HashMap<>();
    private Discount discount = new NoDiscount();

    /**
     * Add product to the order.
     *
     * @param product product to add.
     */
    public void add(Product product) {
        shoppingCart.merge(product, 1, Integer::sum);
    }

    /**
     * Add product to the order.
     *
     * @param productCode product to add.
     */
    public void add(String productCode, int quantity) {

        shoppingCart.merge(new Product(productCode), quantity, Integer::sum);
    }

    /**
     * Get total price.
     *
     * @return total price of order.
     */
    public Money getTotalPrice() {
        Money totalPrice = new Money();
        shoppingCart.forEach((product, quantity) -> totalPrice.addNTimes(product.getProductPrice(), quantity));
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
        return shoppingCart;
    }

    /**
     * Get total of products in the order.
     *
     * @return total of products in the order.
     */
    public int getNumberOfProducts() {
        return shoppingCart.values().stream().reduce(0, Integer::sum);
    }

    /**
     * Get quantity of a type of product in the order.
     *
     * @param product Product to check.
     * @return Quantity of this product in the order.
     */
    public int getProductQuantity(Product product) {
        return shoppingCart.getOrDefault(product, 0);
    }
}
