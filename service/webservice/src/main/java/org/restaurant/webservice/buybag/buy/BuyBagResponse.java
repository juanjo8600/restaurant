package org.restaurant.webservice.buybag.buy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement(name = "buyBagResponse1") public class BuyBagResponse implements Serializable {

  private String prop;

   @XmlElement(name = "prop1")
   public String getProp() {
	  return prop;
   }

   public void setProp(String prop) {
	  this.prop = prop;
   }
}
