package com.onlineshop.backendproject.Daos;

import com.onlineshop.backendproject.Address;

public interface AddressDao {
	
	public boolean addAddress(Address address);
	public Address getAddressById(int addressId);
	public void updateAddress(Address address);
	public void deleteAddress(int addressId);

}
