package org.restaurant.repository.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by juanjosejimenezfernandez on 21/12/16.
 */
@Entity
@Table(name = "BILL")
public class Bill {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "BILL_DATE")
    private Date billDate;

    @Column(name = "CLIENT_CODE")
    private Integer clientCode;

    @Column(name = "TOTAL_PRICE")
    private Double price;

    @OneToMany
    private List<BillDetail> billDetail;
}
