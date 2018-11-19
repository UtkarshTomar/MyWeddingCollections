package com.onlineshop.backendproject;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onlineshop.backendproject.Daos.AddressDao;

public class AddressTest {
	

/*static AddressDao addressobj;

@BeforeClass
public static void init(){
	
	AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
	app.scan("com.onlineshop");
	app.refresh();
	addressobj=app.getBean("AddressDao",AddressDao.class);
}

@Test
public void addAddress(){
	
	Address add=new Address();
	add.setHouseNumber(22);
	add.setLocality("Malviya Nagar");
	add.setCity("Delhi");
	add.setPinCode(110017);
	add.setState("New Delhi");
	add.setUser(null);
	
	
	boolean r=addressobj.addAddress(add);
	
	This test will fail if value of r is false . 
	assertTrue("Problem in Adding Category",r);
}
*/}
