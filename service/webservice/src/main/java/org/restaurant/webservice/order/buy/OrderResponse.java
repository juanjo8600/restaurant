package org.restaurant.webservice.order.buy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement(namespace = "org.restaurant.webservice") public class OrderResponse implements Serializable {

   private String orderId;

   @XmlElement public String getOrderId() {
	  return orderId;
   }

   public void setOrderId(String orderId) {
	  this.orderId = orderId;
   }
}
