package com.question.MasteryChallengeProduct.repository;

import com.question.MasteryChallengeProduct.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}