package com.onlineshop.backendproject.Daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshop.backendproject.Address;

@Repository("Addressdao")
@Transactional

public class AddressDaoImpl implements AddressDao{

	@Autowired
	SessionFactory sessionFactory;
	


	public boolean addAddress(Address address) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(address);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}	
	
	
	@Override
	public Address getAddressById(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAddress(int addressId) {
		// TODO Auto-generated method stub
		
	}
}