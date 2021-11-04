package com.rohith.backend.services;

import com.rohith.backend.entity.AddressEntity;
import com.rohith.backend.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    public AddressEntity addAddress(AddressEntity addressEntity){
        return addressRepo.save(addressEntity);
    }

    public List<AddressEntity> fetchAddress(String email){
        return addressRepo.findByEmail(email);
    }
}
