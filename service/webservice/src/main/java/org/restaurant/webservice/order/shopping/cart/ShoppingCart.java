package org.restaurant.webservice.order.shopping.cart;

import org.restaurant.webservice.order.product.ProductRequest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement(namespace = "org.restaurant.webservice")
@XmlType(namespace = "org.restaurant.webservice", name = "ShoppingCart")
public class ShoppingCart {

    private List<ProductRequest> shoppingCart = new ArrayList<>();

    public List<ProductRequest> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<ProductRequest> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
