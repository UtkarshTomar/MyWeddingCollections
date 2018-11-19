package com.onlineshop.backendproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="Sup_tab")
	public class  Supplier{

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int supplierid;
		private String suppliername;
		
		public String getSuppliername() {
			return suppliername;
		}
		public void setSuppliername(String suppliername) {
			this.suppliername = suppliername;
		}
		
		
		
		public int getSupplierid() {
			return supplierid;
		}
		public void setSupplierid(int supplierid) {
			this.supplierid = supplierid;
		}
		@Override
		public String toString() {
			return "Category [suppliername=" + suppliername + "]";
		}

		
		
	}

