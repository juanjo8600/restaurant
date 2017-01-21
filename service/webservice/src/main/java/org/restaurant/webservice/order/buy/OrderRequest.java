package org.restaurant.webservice.order.buy;

import org.restaurant.webservice.order.shopping.cart.ShoppingCart;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 10/01/2017.
 */
@XmlRootElement(namespace = "org.restaurant.webservice") public class OrderRequest implements Serializable {

   private ShoppingCart shoppingCart;

   public OrderRequest() {
   }

   public OrderRequest(ShoppingCart shoppingCart) {
	  this.shoppingCart = shoppingCart;
   }

   @XmlElement public ShoppingCart getShoppingCart() {
	  return shoppingCart;
   }

   public void setShoppingCart(ShoppingCart shoppingCart) {
	  this.shoppingCart = shoppingCart;
   }

}
