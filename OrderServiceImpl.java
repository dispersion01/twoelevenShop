package com.any.twoelevenshop;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(scopeName = "prototype")
public class OrderServiceImpl implements OrderService {

    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }


    public List<Integer> add(List<Integer> item) {
        return basket.addItem(item);
    }

    @Override
    public List<Integer> get() {
        return basket.getItem();
    }
}
