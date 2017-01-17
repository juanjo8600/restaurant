package org.restaurant.webservice.buybag.buy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement @XmlType(name = "BuyBagResponse") public class BuyBagResponse
   implements Serializable {

   private String prop;

   @XmlElement(name = "Prop1") public String getProp() {
	  return prop;
   }

   public void setProp(String prop) {
	  this.prop = prop;
   }
}
