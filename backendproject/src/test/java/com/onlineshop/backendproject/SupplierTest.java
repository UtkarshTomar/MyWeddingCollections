package com.onlineshop.backendproject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onlineshop.backendproject.Supplier;
import com.onlineshop.backendproject.Daos.SupplierDao;

public class SupplierTest {
public static SupplierDao supplierObj;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
		app.scan("com.onlineshop");
		app.refresh();
		supplierObj=app.getBean("SupplierDao",SupplierDao.class);
	}
	
	@Test
	@Ignore
	public void addSupplier(){
		Supplier sup=new Supplier();
		sup.setSuppliername("Rajesh");
		
		
		 boolean r=supplierObj.addSupplier(sup);
		 
			
			assertTrue("Problem in Adding Supplier",r);
	
	}
	
	@Test
	@Ignore
	public void deleteSupplier(){
		Supplier sup=supplierObj.getSupplierById(33);
		boolean r=supplierObj.deleteSupplier(sup);
		
		assertTrue("Problem in deleting Supplier",r);
		}
	
	@Test
	@Ignore
	public void updateSupplier() {
		Supplier sup=supplierObj.getSupplierById(70);
		sup.setSuppliername("Utkarsh");
		
		boolean r=supplierObj.updateSupplier(sup);
		
		assertTrue("Problem in updating ",r);
		
	}
	
	@Test
	@Ignore
	public void getSupplierId(){
		Supplier supObj=supplierObj.getSupplierById(70);
		System.out.println(supObj);
		assertNotNull("Supplier Not Found", supObj);
	}
	
	@Test
	@Ignore
	public void getallSupplier(){
		List<Supplier> supplierList=supplierObj.getAllSupplier();
		System.out.println(supplierList);
		assertNotNull("Suppliers Not Found", supplierList);
	}

}
