package org.restaurant.webservice.order.shopping.cart;

import org.restaurant.webservice.order.product.ProductRequest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement(namespace = "org.restaurant.webservice") @XmlType(namespace = "org.restaurant.webservice", name = "ShoppingCart") public class ShoppingCart {

   private List<ProductEntry> shoppingCart = new ArrayList<>();

   // TODO
   //   public void add(ProductRequest product) {
   //	  shoppingCart.contains(pr)
   //   }

   public List<ProductEntry> getShoppingCart() {
	  return shoppingCart;
   }

   public void setShoppingCart(List<ProductEntry> shoppingCart) {
	  this.shoppingCart = shoppingCart;
   }

   public void add(ProductRequest productRequest, int quantity) {
	  ProductEntry productEntry = new ProductEntry(productRequest, quantity);
	  shoppingCart.add(productEntry);

   }
}
