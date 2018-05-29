package com.test.services;

import com.test.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> listProducts() {
        ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product("Product 1 description"));
        products.add(new Product("Product 2 description"));
        return products;
    }
}
