package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.Product;

@Repository
public class ProductDaoIml implements ProductDaoInt{
	
	List<Product> products=new ArrayList<Product>();
	
	public ProductDaoIml() {
		
		Product iphone = new Product("P1001", "iPhone 5s", 549.99);
		iphone.setDescription("Apple iPhone 5s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
		iphone.setCategory("SmartPhone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);

		Product laptopDell = new Product("P1002", "Dell Inspiron", 799.99);
		laptopDell.setDescription("Dell Inspiron 14-inch Laptop (Black) with 3rd Generation Intel Core processors");
		laptopDell.setCategory("Laptop");
		laptopDell.setManufacturer("Dell");
		laptopDell.setUnitsInStock(1000);

		Product laptopDell133 = new Product("P1003", "Dell Inspiron 13.3", 900);
		laptopDell133.setDescription("6th Gen Intel Core i5 processor; 13.3");
		laptopDell133.setCategory("Laptop");
		laptopDell133.setManufacturer("Dell");
		laptopDell133.setUnitsInStock(500);

		Product tabletNexus = new Product("P1004", "Nexus 7", 298.99);
		tabletNexus.setDescription(
				"Google Nexus 7 is the lightest 7 inch tablet With a quad-core Qualcomm Snapdragon S4 Pro processor");
		tabletNexus.setCategory("Tablet");
		tabletNexus.setManufacturer("Google");
		tabletNexus.setUnitsInStock(400);

		Product tabletSamsungS297 = new Product("P1005", "Galaxy Tab S2 9.7", 575.99);
		tabletSamsungS297.setDescription("9.7 Super AMOLED touch-screen display with 2048 x 1536 resolution");
		tabletSamsungS297.setCategory("Tablet");
		tabletSamsungS297.setManufacturer("Samsung");
		tabletSamsungS297.setUnitsInStock(300);

		Product tabletSamsungS280 = new Product("P1006", "Galaxy Tab S2 8.0", 349.99);
		tabletSamsungS280.setDescription("8.0 Super AMOLED touch-screen display with 2048 x 1536 resolution");
		tabletSamsungS280.setCategory("Tablet");
		tabletSamsungS280.setManufacturer("Samsung");
		tabletSamsungS280.setUnitsInStock(300);

		Product laptopAppleAir = new Product("P1007", "Apple - MacBook Air", 999.99);
		laptopAppleAir
				.setDescription("5th Gen Intel® Core i5 processor; 13.3 display; 4GB memory; 128GB flash storage");
		laptopAppleAir.setCategory("Laptop");
		laptopAppleAir.setManufacturer("Apple");
		laptopAppleAir.setUnitsInStock(100);

		Product laptopAppleMacbook = new Product("P1007", "Apple - MacBook Pro", 1299.99);
		laptopAppleMacbook
				.setDescription("MacBook Pro with Retina display - 13.3 Display - 8GB Memory - 128GB Flash Storage");
		laptopAppleMacbook.setCategory("Laptop");
		laptopAppleMacbook.setManufacturer("Apple");
		laptopAppleMacbook.setUnitsInStock(100);
		
		products.add(iphone);
		products.add(laptopDell);
		products.add(laptopDell133);
		products.add(tabletNexus);
		products.add(tabletSamsungS297);
		products.add(tabletSamsungS280);
		products.add(laptopAppleAir);
		products.add(laptopAppleMacbook);

	}
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product getProductById(String productID) {
		
		
		Product foundProduct=new Product();
		
		for(Product product:products) {
			
			if(product.getProductId().equals(product)) {
				
				foundProduct=product;
			}
		}
		
		return foundProduct;
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		
		List<Product> productList=new ArrayList<Product>();
		
		for(Product product:products) {
			
	      if(product.getCategory().equalsIgnoreCase(category)) {
	    	  
	    	  productList.add(product);
	      }
		}
		
		return productList;
	}

	@Override
	public List<Product> getProductsByBrands(List<String> brands) {
		
		List<Product> productsList=new ArrayList<Product>();
		
		for(String brand:brands) {
			
			for(Product product:products) {
				
				if(brand.equalsIgnoreCase(product.getManufacturer())) {
					
					productsList.add(product);
				}
			}
		}
		
		return productsList;
	}

}
