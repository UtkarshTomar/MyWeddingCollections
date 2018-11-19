package com.onlineshop.backendproject.Daos;

import java.util.List;

import com.onlineshop.backendproject.Product;

public interface ProductDao {
	public boolean addProduct(Product ProductObj);
	public boolean deleteProduct(Product ProductObj);
	public boolean updateProduct(Product Product );
	public Product getProductById(int productId);
	public List<Product> getAllProducts();
	public List<Product> getAllProductsByCategory(int categoryId);
}
