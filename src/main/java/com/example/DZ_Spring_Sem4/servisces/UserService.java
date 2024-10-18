package com.example.DZ_Spring_Sem4.servisces;


import org.springframework.stereotype.Service;
import com.example.DZ_Spring_Sem4.models.User;
import com.example.DZ_Spring_Sem4.repository.UserRepository;
import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers(){
        return repository.getUsers();
    }
    public void addUser(User user){
        user.setId(repository.getUsers().size() + 1);
        repository.addUser(user);
    }
}

