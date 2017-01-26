package org.restaurant.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by juanjosejimenezfernandez on 25/12/16.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String detail;

    private double publicPrice;
}
