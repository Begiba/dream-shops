package com.dailycodework.dreamshops.service.cart;

import com.dailycodework.dreamshops.model.Cart;
import com.dailycodework.dreamshops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(long id);
    BigDecimal getTotalPrice(long id);

    //Long initializeNewCart();
    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
