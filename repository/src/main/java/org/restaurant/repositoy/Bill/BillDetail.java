package org.restaurant.repositoy.bill;

import javax.persistence.*;

/**
 * Created by juanjosejimenezfernandez on 25/12/16.
 */
@Entity
@Table(name = "BILL_DETAIL")
public class BillDetail {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Bill bill;

    private Product product;

    private int quantity;
}
