package org.restaurant.service.products;

import org.restaurant.domain.product.Product;
import org.restaurant.repository.product.ProductRepository;
import org.restaurant.service.products.dto.GetAllProductsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * Created by juanjose on 3/2/17.
 */
@Service
public class GetAllProductsServiceImpl implements GetAllProductsService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public GetAllProductsResult getAllProducts() {
        GetAllProductsResult result = new GetAllProductsResult();

        result.setProducts(productRepository.findAll().stream().map(product -> new Product(product.getId(), product.getName(), product.getPublicPrice())).collect(Collectors.toList()));

        return result;
    }
}
