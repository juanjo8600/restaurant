package org.restaurant.webservice.buybag.product;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement public class ProductRequest implements Serializable {

   private String productCode;
   private int quantity;

   public ProductRequest() {
   }

   public ProductRequest(String productCode, int quantity) {
	  this.productCode = productCode;
	  this.quantity = quantity;
   }

   @XmlElement public String getProductCode() {
	  return productCode;
   }

   public void setProductCode(String productCode) {
	  this.productCode = productCode;
   }

   @XmlElement public int getQuantity() {
	  return quantity;
   }

   public void setQuantity(int quantity) {
	  this.quantity = quantity;
   }
}
