package com.guilherme.productcatalog.repository;

import com.guilherme.productcatalog.modal.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
