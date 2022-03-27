package com.any.twoelevenshop;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Integer> add(List<Integer> item);

    List<Integer> get();

}
