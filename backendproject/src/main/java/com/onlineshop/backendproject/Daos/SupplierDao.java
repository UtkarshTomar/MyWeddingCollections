package com.onlineshop.backendproject.Daos;

import java.util.List;

import com.onlineshop.backendproject.Supplier;

public interface SupplierDao {
	public boolean addSupplier(Supplier supplierObj);
	public boolean deleteSupplier(Supplier supplierObj);
	public boolean updateSupplier(Supplier Supplier );
	public Supplier getSupplierById(int supplierId);
	public List<Supplier> getAllSupplier();
}
