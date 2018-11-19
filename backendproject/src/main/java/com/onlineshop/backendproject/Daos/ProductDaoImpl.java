package com.onlineshop.backendproject.Daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshop.backendproject.Product;
@Repository("ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	
			@Autowired
			SessionFactory sessionFactory;
			

			@Override
			public boolean addProduct(Product ProductObj) {
				try {
					Session session=sessionFactory.getCurrentSession();
					session.save(ProductObj);
					return true;
					}
					catch(Exception e){
					e.printStackTrace();
					return false;
					}
		
		
			}
			
			
			@Override
			public boolean deleteProduct(Product  ProductObj) {
				try {
					Session session=sessionFactory.getCurrentSession();
					session.delete(ProductObj);
					return true;
					}
					catch(Exception e){
					e.printStackTrace();
					return false;
					}
			}


			@Override
			public boolean updateProduct(Product Product) {
				try {
					Session session=sessionFactory.getCurrentSession();
					session.update(Product);
					return true;
					}
					catch(Exception e){
					e.printStackTrace();
					return false;
					}
			}


			@Override
			public Product getProductById(int productId) {
				
				try{
					Session session=sessionFactory.getCurrentSession();
					Product pObj=(	Product)session.get(	Product.class,	productId);
					return pObj;
					}
					catch(Exception e){
						e.printStackTrace();
					}
					return null;
			}


			@Override
			public List<Product> getAllProducts() {
				try{
					Session session=sessionFactory.getCurrentSession();
					Criteria cr=session.createCriteria(Product.class);
					List<Product> list= cr.list();
					return list;
					}
					catch(Exception e){
						e.printStackTrace();
					}
					return null;
			}


			@Override
			public List<Product> getAllProductsByCategory(int categoryId) {
				try{
					Session session=sessionFactory.getCurrentSession();
					Query query=session.createQuery("from com.onlineshop.backendproject.Product where categoryid=:a");
					query.setParameter("a",categoryId);
					List<Product> list= query.getResultList();
					return list;
					}
					catch(Exception e){
						e.printStackTrace();
					}
					return null;
			}

}

