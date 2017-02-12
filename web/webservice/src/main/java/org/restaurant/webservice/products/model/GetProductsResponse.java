package org.restaurant.webservice.products.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by juanjose on 4/2/17.
 */
@XmlRootElement(namespace = "org.restaurant.webservice")
@XmlType(namespace = "org.restaurant.webservice", name = "GetProductsResponse")
public class GetProductsResponse implements Serializable{

    private List<ProductResponse> productResponse;

    @XmlElement
    public List<ProductResponse> getProductResponse() {
        return productResponse;
    }

    public void setProductResponses(List<ProductResponse> productResponses) {
        this.productResponse = productResponses;
    }
}
