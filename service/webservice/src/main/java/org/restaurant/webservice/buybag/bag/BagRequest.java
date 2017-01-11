package org.restaurant.webservice.buybag.bag;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jj.jimenez on 11/01/2017.
 */
@XmlRootElement public class BagRequest {

   private List<ProductEntry> bag = new ArrayList<>();

   // TODO
   //   public void add(ProductRequest product) {
   //	  bag.contains(pr)
   //   }

   public List<ProductEntry> getBag() {
	  return bag;
   }

   public void setBag(List<ProductEntry> bag) {
	  this.bag = bag;
   }
}
