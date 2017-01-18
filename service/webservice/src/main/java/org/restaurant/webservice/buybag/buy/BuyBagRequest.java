package org.restaurant.webservice.buybag.buy;

import org.restaurant.webservice.buybag.bag.BagRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 10/01/2017.
 */
@XmlRootElement(namespace = "org.restaurant.webservice") public class BuyBagRequest implements Serializable {

   private BagRequest bagRequest;

   public BuyBagRequest() {
   }

   public BuyBagRequest(BagRequest bagRequest) {
	  this.bagRequest = bagRequest;
   }

   @XmlElement public BagRequest getBagRequest() {
	  return bagRequest;
   }

   public void setBagRequest(BagRequest bagRequest) {
	  this.bagRequest = bagRequest;
   }

}
