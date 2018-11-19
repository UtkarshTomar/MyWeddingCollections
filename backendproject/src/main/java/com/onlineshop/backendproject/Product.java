package com.onlineshop.backendproject;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;
@Entity
@Table(name="Pro_tab")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
	private String productname;
	private double price;
	private int quantity;
	private String productdescription;
	private int categoryid;
	private int supplierid;
	private String imgName;
	private String status;
	
	@Transient
	private MultipartFile pimage;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="supplierid",insertable=false,updatable=false,nullable=false)
	private Supplier supplierObj;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="categoryid",insertable=false,updatable=false,nullable=false)
	private Category categoryObj;
	
	
	
	
public MultipartFile getPimage() {
		return pimage;
	}


	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}


public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}


	public int getSupplierid() {
		return supplierid;
	}


	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}


	public String getImgName() {
		return imgName;
	}


	public void setImgName(String imgName) {
		this.imgName = imgName;
	}


public Product(){
}


public Product( String productname,String productdescription,String status){
	super();
	
	this.productname = productname;
	this.productdescription =productdescription;
	this.status=status;
}



public int getProductid() {
	return productid;
}


public void setProductid(int productid) {
	this.productid = productid;
}


public Supplier getSupplierObj() {
	return supplierObj;
}


public void setSupplierObj(Supplier supplierObj) {
	this.supplierObj = supplierObj;
}


public Category getCategoryObj() {
	return categoryObj;
}


public void setCategoryObj(Category categoryObj) {
	this.categoryObj = categoryObj;
}


public String getProductname() {
	return productname;
	}


public void setProductname(String productname) {
	this.productname = productname;
}


public String getProductdescription() {
	return productdescription;
}


public void setProductdescription(String productdescription) {
	this.productdescription = productdescription;
}
public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


@Override
public String toString() {
	return "Product [productname=" + productname + ", price=" + price
			+ ", quantity=" + quantity + ", productdescription="
			+ productdescription + ", categoryid=" + categoryid
			+ ", supplierid=" + supplierid + ", imgName=" + imgName
			+ ", status=" + status + ", supplierObj=" + supplierObj
			+ ", categoryObj=" + categoryObj + "]";
}



}



