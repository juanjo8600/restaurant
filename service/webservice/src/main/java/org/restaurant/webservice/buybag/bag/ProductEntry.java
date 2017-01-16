package org.restaurant.webservice.buybag.bag;

import org.restaurant.webservice.buybag.product.ProductRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement public class ProductEntry implements Serializable {

   private ProductRequest productRequest;
   private int quantity;

   public ProductEntry() {
   }

   public ProductEntry(ProductRequest productRequest, int quantity) {
	  this.productRequest = productRequest;
	  this.quantity = quantity;
   }

   @XmlElement public ProductRequest getProductRequest() {
	  return productRequest;
   }

   public void setProductRequest(ProductRequest productRequest) {
	  this.productRequest = productRequest;
   }

   @XmlElement public int getQuantity() {
	  return quantity;
   }

   public void setQuantity(int quantity) {
	  this.quantity = quantity;
   }

}
