package com.demo.simple.dao;

import java.util.List;

import com.demo.simple.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class ProductDAOImpl implements ProductDAO {

	private EntityManager entityManager;
	
	@Autowired
	public ProductDAOImpl(EntityManager entityMag)                    //injection through constructor
	{
		this.entityManager =entityMag;
	}
	
	@Override
	@Transactional
	public void save(Product product) {
		entityManager.persist(product);
	}

	@Override
	public Product findById(int id) {
		
		return entityManager.find(Product.class, id);
	}

	@Override
	public List<Product> findAll()
	{
		TypedQuery<Product> productList = entityManager.createQuery("FROM Product",Product.class);
		
				return productList.getResultList();
	}
	
	
	@Override
	@Transactional
	public void update(Product myProduct) {
		
		entityManager.merge(myProduct);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		
		Product prod = entityManager.find(Product.class, id);
		
		entityManager.remove(prod);
	}
}
