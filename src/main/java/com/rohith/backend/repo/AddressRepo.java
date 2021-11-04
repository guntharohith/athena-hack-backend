package com.rohith.backend.repo;

import com.rohith.backend.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepo extends JpaRepository<AddressEntity,Integer> {
    public List<AddressEntity> findByEmail(String email);
}
