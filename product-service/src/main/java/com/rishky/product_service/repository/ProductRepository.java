package com.rishky.product_service.repository;


import com.rishky.product_service.modal.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}