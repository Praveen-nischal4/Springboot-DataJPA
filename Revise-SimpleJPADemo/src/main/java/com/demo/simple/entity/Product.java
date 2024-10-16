package com.demo.simple.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private int id;
	
	@Column(name="pname")
	private String name;
	
	@Column(name="category")
	private String cat;
	
	@Column(name="price")
	private double pprice;

	public Product() {
		super();
	}

	public Product(String name, String cat, double pprice) {
		super();
		this.name = name;
		this.cat = cat;
		this.pprice = pprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cat=" + cat + ", pprice=" + pprice + "]";
	}
	
	
}
