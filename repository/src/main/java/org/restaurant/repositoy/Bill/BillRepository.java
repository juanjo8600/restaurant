package org.restaurant.repositoy.bill;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by juanjosejimenezfernandez on 21/12/16.
 */
@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {


}
