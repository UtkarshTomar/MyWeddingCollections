package com.onlineshop.backendproject.Daos;

import java.util.List;

import com.onlineshop.backendproject.Category;

public interface CategoryDao {
	
	public boolean addCategory(Category categoryObj);
	public boolean deleteCategory(Category categoryObj);
	public boolean updateCategory(Category category );
	public Category getCategoryById(int categoryId);
	public List<Category> getAllCategories();
}
