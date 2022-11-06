package com.question.MasteryChallengeProduct.service;

import com.question.MasteryChallengeProduct.domain.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();
}