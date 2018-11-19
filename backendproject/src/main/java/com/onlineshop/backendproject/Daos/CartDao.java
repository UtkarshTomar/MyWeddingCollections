package com.onlineshop.backendproject.Daos;

import com.onlineshop.backendproject.Cart;

public interface CartDao {
    boolean addCart(Cart cart);
    Cart getCartByCustomer(String customerId);
    boolean deleteCart(int cartId);
}
