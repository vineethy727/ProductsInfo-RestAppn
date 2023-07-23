package com.product.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.KitchenProducts;
import com.product.service.KitchenProductsServiceImp;

@CrossOrigin(origins = "*")
@RestController
public class KitchenProductsController {

	
	@Autowired
	private KitchenProductsServiceImp kpservice; 
	
	
	@PostMapping("/insert")
	public String insert(@RequestBody KitchenProducts kp, Model m)
	{
		KitchenProducts kpc=kpservice.saveproduct(kp);
		String msg=null;
		if(kpc!=null)
			msg="data inserted sucessfully";
		else
			msg="data didnot inserted";
		return msg;
	}
	
	@DeleteMapping("/delete/{prodid}")
	public String deleteProd(@PathVariable Integer prodid)
	{ 
		kpservice.delete(prodid);
		return "product deleted";
	}
	
	@GetMapping("/get/{prodid}")
	public KitchenProducts getProduct(@PathVariable Integer prodid)
	{
		KitchenProducts kp1=kpservice.getproduct(prodid);
		return kp1;
	}
	
	@PutMapping("/update/{prodid}")
	public String updateProduct(@RequestBody KitchenProducts kp, @PathVariable Integer prodid)
	{
		KitchenProducts kpu=kpservice.updateproduct(kp, prodid);
		String updmsg=null;
		if(kpu!=null)
			updmsg="details updated successfully";
		else
			updmsg="details not updated";
		
		return updmsg;
	}
	
	@GetMapping("/getall")
	public List<KitchenProducts> getAll()
	{
		List<KitchenProducts> allprod=kpservice.getAllProducts();
				
		return allprod;
	}
	
}
