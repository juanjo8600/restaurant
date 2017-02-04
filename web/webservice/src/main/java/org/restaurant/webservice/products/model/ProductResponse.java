package org.restaurant.webservice.products.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by juanjose on 4/2/17.
 */
@XmlRootElement(namespace = "org.restaurant.webservice")
@XmlType(namespace = "org.restaurant.webservice", name = "ProductResponse")
public class ProductResponse implements Serializable {

    private String code;

    private String name;

    //TODO change to Money object.

    private BigDecimal price;

    public ProductResponse() {
    }

    public ProductResponse(String code, String name, BigDecimal price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @XmlElement
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
