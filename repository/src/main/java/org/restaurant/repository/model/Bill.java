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

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Integer getClientCode() {
        return clientCode;
    }

    public void setClientCode(Integer clientCode) {
        this.clientCode = clientCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<BillDetail> getBillDetail() {
        return billDetail;
    }

    public void setBillDetail(List<BillDetail> billDetail) {
        this.billDetail = billDetail;
    }
}
