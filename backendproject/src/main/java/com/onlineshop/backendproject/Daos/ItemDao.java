package com.onlineshop.backendproject.Daos;

import java.util.List;

import com.onlineshop.backendproject.Item;

public interface ItemDao {
	 boolean addItem(Item item);
	    boolean updateItem(Item item);
	    Item getItemByProductIdAndCustomerId(int productid,String customerId);
	    List<Item> getItemsListByCart(int cartId);
	    boolean increaseQuantity(int itemId);
	    boolean decreaseQuantity(int itemId);
	    boolean deleteItem(int itemId);
	     
	}
