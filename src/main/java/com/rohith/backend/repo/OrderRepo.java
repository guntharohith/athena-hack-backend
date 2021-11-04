package com.rohith.backend.repo;

import com.rohith.backend.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepo extends JpaRepository<OrderEntity,Integer> {
    public List<OrderEntity> findByEmail(String email);
}
