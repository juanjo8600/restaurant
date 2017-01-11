package org.restaurant.webservice.buybag;

import org.junit.Test;
import org.restaurant.webservice.BuyBag;
import org.restaurant.webservice.buybag.bag.BagRequest;
import org.restaurant.webservice.buybag.buy.BuyBagRequest;
import org.restaurant.webservice.buybag.buy.BuyBagResponse;
import org.restaurant.webservice.buybag.product.ProductRequest;

/**
 * Created by jj.jimenez on 05/01/2017.
 */
public class BuyBagTest {

   // TODO use spring DI???
   private BuyBag buyBagService = new BuyBag();

   @Test public void buyBagServiceTest() {
	  BagRequest bagRequest = new BagRequest();

	  ProductRequest productRequest2 = new ProductRequest("2", 1);
//	  bagRequest.add(productRequest2);
	  ProductRequest productRequest5 = new ProductRequest("5", 1);
//	  bagRequest.add(productRequest5);
	  ProductRequest productRequest1 = new ProductRequest("1", 4);
//	  bagRequest.add(productRequest1);

	  BuyBagRequest buyBagResquest = new BuyBagRequest(bagRequest);

	  BuyBagResponse buyBagResponse = buyBagService.buyBag(buyBagResquest);

   }
}