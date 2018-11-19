package com.onlineshop.backendproject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onlineshop.backendproject.Category;
import com.onlineshop.backendproject.Daos.CategoryDao;

public class CategoyTest {

	public static CategoryDao categoryObj;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
		app.scan("com.onlineshop");
		app.refresh();
		categoryObj=app.getBean("categoryDao",CategoryDao.class);
	}

	
	@Test
	@Ignore
	public void addCategory(){
		Category cat=new Category();
		cat.setCategoryname("Bridal Collections");
		cat.setCategorydescription("A wide range of Bridal collections");

		 boolean r=categoryObj.addCategory(cat);
		
		//This test will fail if value of r is false . 
		assertTrue("Problem in Adding Category",r);
	}
	@Test
	@Ignore
	public void deleteCategory(){
		Category cat=new Category();
		if(cat != null)
		{
		boolean r=categoryObj.deleteCategory(cat);
		
		assertTrue("Problem in deleting Category",r);
		}
		
		
	}
		@Test
		@Ignore
		public void updateCategory(){
			Category cat=new Category();
			cat.setCategorydescription("Bridal Wear");
			boolean r=categoryObj.deleteCategory(cat);
			
			assertTrue("Problem in updating Category",r);
		
		}
		
		@Test
		@Ignore
		public void getCategoryId(){
			Category catObj=categoryObj.getCategoryById(34);
			System.out.println(catObj);
			assertNotNull("Category Not Found", catObj);
		}

		@Test
		@Ignore
		public void getAllCategories(){
			List<Category> categoryList=categoryObj.getAllCategories();
			System.out.println(categoryList);
			assertNotNull("Categories Not Found", categoryList);
		}

}