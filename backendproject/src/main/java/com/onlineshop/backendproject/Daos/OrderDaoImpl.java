package com.onlineshop.backendproject.Daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshop.backendproject.Order;

@Repository("orderDAO")
@Transactional
public class OrderDaoImpl implements OrderDao {

		@Autowired
		private SessionFactory sessionFactory;
		
		public Session getSession(){
			return sessionFactory.getCurrentSession();
		}

		@Override
		public int makeOrder(Order order) {
			return (int) getSession().save(order);
			
		}
	}
