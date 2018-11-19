package com.onlineshop.backendproject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onlineshop.backendproject.Product;
import com.onlineshop.backendproject.Daos.ProductDao;

public class ProductTest {

	public static ProductDao productObj;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
		app.scan("com.onlineshop");
		app.refresh();
		productObj=app.getBean("ProductDao",ProductDao.class);
	}

	
	@Test
	//1@Ignore
	public void addProduct(){
		Product pro=new Product();
		pro.setProductname("Kurtis");
		pro.setProductdescription("Kurtis for bride");
		pro.setStatus("Active");
		pro.setCategoryid(1);
		pro.setSupplierid(37);
		 boolean r=productObj.addProduct(pro);
		
		//This test will fail if value of r is false . 
		assertTrue("Problem in Adding Product",r);
	}
	
	
	@Test
	@Ignore
	public void deleteProduct(){
		Product pro=productObj.getProductById(3);
		if(pro!= null)
		{
		boolean r=productObj.deleteProduct(pro);
		
		assertTrue("Problem in deleting Product",r);
		}
		
		
	}
		@Test
		@Ignore
		public void updateProduct(){
			Product pro=productObj.getProductById(3);
			pro.setProductdescription("Sale Sale");
			boolean r=productObj.updateProduct(pro);
			
			assertTrue("Problem in updating product",r);
		
		}
		
		@Test
		@Ignore
		public void getProductId(){
			Product proObj=productObj.getProductById(4);
			System.out.println(proObj);
			assertNotNull("Product Not Found", proObj);
		}

		@Test
		@Ignore
		public void getAllProducts(){
			List<Product> productList=productObj.getAllProducts();
			System.out.println(productList);
			assertNotNull("Products Not Found", productList);
		}
		
		@Test
		@Ignore
		public void getAllProductsByCategory() {
			List<Product> productList=productObj.getAllProductsByCategory(1);
			System.out.println(productList);
			assertNotNull("Products Not Found", productList);
		}
}