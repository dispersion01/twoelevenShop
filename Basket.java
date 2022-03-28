package com.any.twoelevenshop;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
@Component
@SessionScope
public class Basket {
    private final List<Integer> item;

    public Basket(List<Integer> item) {
        this.item = item;
    }

    public List<Integer> addItem() {
        return item;
    }
    public List<Integer> getItem() {
        return Collections.unmodifiableList(item);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "item=" + item +
                '}';
    }
}
