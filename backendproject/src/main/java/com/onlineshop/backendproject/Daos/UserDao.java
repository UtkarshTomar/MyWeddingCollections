package com.onlineshop.backendproject.Daos;

import java.util.List;

import com.onlineshop.backendproject.Address;
import com.onlineshop.backendproject.User;


public interface UserDao {
	
	
	public boolean registerUser(User user);
	public User validateUser(String email,String password);
	public boolean addAddress(Address address);
	public Address getAddress(int addressId);
	public boolean deleteAddress(Address address);
	public boolean updateAddress(Address address);
	public List<Address> getAllAddressForUser(String email);
	 public User getUser(String email);
}
