package com.CodeTech.Flight.Service.Service;


import com.CodeTech.Flight.Service.Entiry.User;
import com.CodeTech.Flight.Service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        // Additional business logic can be added here
        return userRepository.save(user);
    }




    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
