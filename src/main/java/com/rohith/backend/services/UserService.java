package com.rohith.backend.services;

import com.rohith.backend.entity.UserEntity;
import com.rohith.backend.models.CustomUserModel;
import com.rohith.backend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    public void createUser(UserEntity user){
        userRepo.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserEntity user =  userRepo.findByEmail(s);
        if(user == null){
            throw new UsernameNotFoundException("User not found !!");
        }
        else{
            return new CustomUserModel(user);
        }
    }


    public UserEntity fetchUser(String userName){
        return userRepo.findByEmail(userName);
    }
}
