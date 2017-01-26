package org.restaurant.repository.bill;

import org.restaurant.repository.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by juanjosejimenezfernandez on 21/12/16.
 */
@Repository public interface BillRepository extends JpaRepository<Bill, Integer> {

}
