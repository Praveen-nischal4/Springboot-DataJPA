package com.demo.simple;

import java.util.List;

import com.demo.simple.dao.ProductDAO;
import com.demo.simple.entity.Product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.simple","com.demo.simple.dao"})
@EntityScan(basePackages = "com.demo.simple.entity")
public class SimpleJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleJpaDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ProductDAO productDAO)
	{
		return runner -> {
			
			saveProducts(productDAO);
			
			//getProduct(productDAO);
			
			//getAllProduct(productDAO);
			
			//updateProductDetails(productDAO);
			
			//deleteProduct(productDAO);
		};
	}

	/*
	 * private void deleteProduct(ProductDAO productDAO) {
	 * 
	 * int pid = 3;
	 * 
	 * System.out.println("Deleting student with id : "+pid);
	 * productDAO.delete(pid); }
	 */
	
	/*
	 * private void updateProductDetails(ProductDAO productDAO) {
	 * 
	 * int pid=2; Product myProduct = productDAO.findById(pid);
	 * 
	 * myProduct.setName("Vivo Phone"); myProduct.setCat("Mobile");
	 * myProduct.setPprice(35948.60);
	 * 
	 * productDAO.update(myProduct);
	 * 
	 * System.out.println("Updated details : "+myProduct); }
	 */

		
	/*
	 * private void getAllProduct(ProductDAO productDAO) {
	 * 
	 * List<Product> myList = productDAO.findAll();
	 * 
	 * for(Product prod :myList) { System.out.println(prod); }
	 * 
	 * }
	 */
	
	
	/*
	 * private void getProduct(ProductDAO productDAO) {
	 * 
	 * //first save product
	 * 
	 * Product myProduct = new Product("LED-CFL","Electric",270.25);
	 * productDAO.save(myProduct);
	 * 
	 * 
	 * System.out.println("Product details with Id "+myProduct.getId());
	 * 
	 * int pid =myProduct.getId();
	 * 
	 * Product result = productDAO.findById(pid); System.out.println(result);
	 * 
	 * 
	 * }
	 */
	
	
	
	
	
	
	  private void saveProducts(ProductDAO productDAO) {
	  
	  Product product1 = new Product("Washing Machine","Electronics",8950.73);
	  Product product2 = new Product("Laptop","Electronics",68950.93); Product
	  product3 = new Product("Microwave","Household",38950.23);
	  productDAO.save(product1); productDAO.save(product2);
	  productDAO.save(product3);
	 
	 
	  }
	 

}
