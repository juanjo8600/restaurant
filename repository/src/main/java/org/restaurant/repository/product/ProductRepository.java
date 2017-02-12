package org.restaurant.repository.product;

import org.restaurant.repository.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by juanjose on 3/2/17.
 */
@Repository public interface ProductRepository extends JpaRepository<Product, Integer> {
}
