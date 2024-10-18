package com.example.DZ_Spring_Sem4.repository;

import org.springframework.stereotype.Component;
import com.example.DZ_Spring_Sem4.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<User> userRepository = new ArrayList<>();

    public List<User> getUsers(){
        return userRepository;
    }

    public void addUser(User user){
        userRepository.add(user);
    }

}
