package com.rohith.backend.repo;
import java.util.List;
import com.rohith.backend.entity.CartEntity;
import com.rohith.backend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepo extends JpaRepository<UserEntity,String> {

    public UserEntity findByEmail(String userName);

}
