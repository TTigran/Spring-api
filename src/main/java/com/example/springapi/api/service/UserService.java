package com.example.springapi.api.service;


import com.example.springapi.api.model.User;
import com.example.springapi.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user, Long id) {
        deleteUser(id);
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public String getAuthToken(String email, String password){
        User loggedUser = userRepository.findByEmail(email);
        return "";
    }


}





