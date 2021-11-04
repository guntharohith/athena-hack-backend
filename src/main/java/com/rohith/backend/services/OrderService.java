package com.rohith.backend.services;

import com.rohith.backend.entity.OrderEntity;
import com.rohith.backend.repo.CartRepo;
import com.rohith.backend.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;
    public OrderEntity saveOrder(OrderEntity orderEntity){
        return orderRepo.save(orderEntity);
    }

    public List<OrderEntity> getOrders(String email){
        return orderRepo.findByEmail(email);
    }
}
