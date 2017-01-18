package org.restaurant.webservice.buybag.buy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement(namespace = "org.restaurant.webservice") public class BuyBagResponse implements Serializable {

   private String serviceNumber;

   @XmlElement public String getServiceNumber() {
	  return serviceNumber;
   }

   public void setServiceNumber(String serviceNumber) {
	  this.serviceNumber = serviceNumber;
   }
}
