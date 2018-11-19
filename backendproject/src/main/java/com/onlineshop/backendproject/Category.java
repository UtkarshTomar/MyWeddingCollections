package com.onlineshop.backendproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="Cat_tab")
	public class Category {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int categoryid;
		private String categoryname;
		private String categorydescription;
		

		
		
	public Category(){
	}


	public Category( String categoryname,String categorydescription){
		super();
		
		this.categoryname = categoryname;
		this.categorydescription = categorydescription;
		
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getCategorydescription() {
		return categorydescription;
	}

	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}


	@Override
	public String toString() {
		return "Category [categoryname=" + categoryname
				+ ", categorydescription=" + categorydescription + "]";
	}


	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}



	}


