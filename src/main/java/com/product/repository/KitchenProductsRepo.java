package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.KitchenProducts;

@Repository
public interface KitchenProductsRepo extends JpaRepository<KitchenProducts, Integer> {

}
