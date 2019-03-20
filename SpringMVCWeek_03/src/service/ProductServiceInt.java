package service;

import java.util.List;

import domain.Product;

public interface ProductServiceInt {
	
	public List<Product> getAllProducts();

	public Product getProductById(String productID);

	public List<Product> getProductsByCategory(String category);

	public List<Product> getProductsByBrands(List<String> brands);

}
