package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductDaoIml;
import domain.Product;

@Service
public class ProductServiceIml implements ProductServiceInt{

	@Autowired
	public ProductDaoIml productDaoIml; 
	
	@Override
	public List<Product> getAllProducts() {
	
		return productDaoIml.getAllProducts();
	}

	@Override
	public Product getProductById(String productID) {
		
		return productDaoIml.getProductById(productID);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
	
		return productDaoIml.getProductsByCategory(category);
	}

	@Override
	public List<Product> getProductsByBrands(List<String> brands) {
	
		return productDaoIml.getProductsByBrands(brands);
	}

}
