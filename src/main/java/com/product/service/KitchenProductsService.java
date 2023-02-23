package com.product.service;

import java.util.List;

import com.product.model.KitchenProducts;

public interface KitchenProductsService {

	
	public KitchenProducts saveproduct(KitchenProducts kp);
	public void delete(Integer prodid);
	public KitchenProducts updateproduct(KitchenProducts kp, Integer prodid);
	public KitchenProducts getproduct(Integer prodid);
	public List<KitchenProducts> getAllProducts();
	
}
