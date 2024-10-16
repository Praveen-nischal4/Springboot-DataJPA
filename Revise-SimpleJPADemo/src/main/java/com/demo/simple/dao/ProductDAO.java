package com.demo.simple.dao;

import java.util.List;

import com.demo.simple.entity.Product;

public interface ProductDAO {

	public void save(Product product);
	public Product findById(int id);
	public List<Product> findAll();
	public void update(Product myProduct);
	public void delete(int id);
}
