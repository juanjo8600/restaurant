package org.restaurant.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by juanjosejimenezfernandez on 25/12/16.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    private String detail;

    private BigDecimal publicPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPublicPrice() {
        return publicPrice;
    }

    public void setPublicPrice(BigDecimal publicPrice) {
        this.publicPrice = publicPrice;
    }
}
