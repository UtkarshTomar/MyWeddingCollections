package com.onlineshop.backendproject.Daos;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshop.backendproject.Category;

	@Repository("categoryDao")
	@Transactional
	public class Categorydaoimpl implements CategoryDao{
		
			@Autowired
			SessionFactory sessionFactory;
			

			@Override
			public boolean addCategory(Category categoryObj) {
				try {
				Session session=sessionFactory.getCurrentSession();
				session.saveOrUpdate(categoryObj);
				return true;
				}
				catch(Exception e){
				e.printStackTrace();
				return false;
				}
		
		
			}
			
			
			@Override
			public boolean deleteCategory(Category categoryObj) {
				try {
					Session session=sessionFactory.getCurrentSession();
					session.delete(categoryObj);
					return true;
					}
					catch(Exception e){
					e.printStackTrace();
					return false;
					}
			}


			@Override
			public boolean updateCategory(Category category) {
				try {
					Session session=sessionFactory.getCurrentSession();
					session.update(category);
					return true;
					}
					catch(Exception e){
					e.printStackTrace();
					return false;
					}
			}
			
			@Override
			public Category getCategoryById(int categoryId) {
				try{
				Session session=sessionFactory.getCurrentSession();
				Category cObj=(Category)session.get(Category.class,categoryId);
				return cObj;
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return null;
			}


			@Override
			public List<Category> getAllCategories() {
				try{
				Session session=sessionFactory.getCurrentSession();
				Criteria cr=session.createCriteria(Category.class);
				List<Category> list=cr.list();
				return list;
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return null;
			}


}
