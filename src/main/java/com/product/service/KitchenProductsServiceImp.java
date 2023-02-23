package com.product.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.KitchenProducts;
import com.product.repository.KitchenProductsRepo;


@Service
public class KitchenProductsServiceImp implements KitchenProductsService {

	@Autowired
	private KitchenProductsRepo kprepo;
	
	
	@Override
	public KitchenProducts saveproduct(KitchenProducts kp) {
		
		
		return kprepo.save(kp);
	}

	@Override
	public void delete(Integer prodid) {
		
		kprepo.deleteById(prodid);

	}
	
	@Override
	public KitchenProducts getproduct(Integer prodid) {
		
		KitchenProducts kpg=kprepo.findById(prodid).get();
		
		return kpg;
	}

	@Override
	public KitchenProducts updateproduct(KitchenProducts kp, Integer prodid) {
		
		Optional <KitchenProducts>optional=kprepo.findById(prodid);
		KitchenProducts kpo=optional.get();
		kpo.setProdid(prodid);
		kpo.setProdname(kp.getProdname());
		kpo.setProdcomp(kp.getProdcomp());
		kpo.setComments(kp.getComments());
		kpo.setPrice(kp.getPrice());
		kpo.setRating(kp.getRating());
		
		return kprepo.save(kpo);
	}

	

	@Override
	public List<KitchenProducts> getAllProducts() {
		List <KitchenProducts> kpalllist=kprepo.findAll();
		return kpalllist;
	}

}
