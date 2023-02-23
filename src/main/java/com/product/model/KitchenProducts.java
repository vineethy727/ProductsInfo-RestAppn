package com.product.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KitchenProducts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="ProductId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer prodid;
	
	@Column(name="ProductName", unique=true, columnDefinition="varchar(40)")
	private String prodname;
	
	@Column(name="ProductCompanyName", unique=true, columnDefinition="varchar(40)")
	private String prodcomp;
	
	@Column(columnDefinition="number(9)")
	private double price;
	
	@Column(columnDefinition="varchar(3)")
	private int rating;
	
	@Column(columnDefinition="varchar(20)")
	private String comments;

	public KitchenProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KitchenProducts(Integer prodid, String prodname, String prodcomp, double price, int rating,
			String comments) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodcomp = prodcomp;
		this.price = price;
		this.rating = rating;
		this.comments = comments;
	}

	public Integer getProdid() {
		return prodid;
	}

	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getProdcomp() {
		return prodcomp;
	}

	public void setProdcomp(String prodcomp) {
		this.prodcomp = prodcomp;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "KitchenProducts [prodid=" + prodid + ", prodname=" + prodname + ", prodcomp=" + prodcomp + ", price="
				+ price + ", rating=" + rating + ", comments=" + comments + "]";
	}

	
	
	
}
