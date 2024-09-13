package com.CodeTech.Flight.Service.Service;

import com.CodeTech.Flight.Service.Entiry.User;
import com.CodeTech.Flight.Service.Repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @InjectMocks
    private UserService userService;


    @Mock
    private UserRepository userRepository;


    private User user ;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveUser() {

        User user = new User();
        user.setId(101L);
        user.setEmail("abc@gmail.com");
        user.setUsername("Ram");


        when(userRepository.save(user)).thenReturn(user);

        User user1 = userService.saveUser(user);

        assertEquals(101L,user1.getId());
        assertEquals("abc@gmail.com",user1.getEmail());
        assertEquals("Ram",user1.getUsername());

    }

    @Test
    void saveUserFailed() {
        User user = null; // Test with a null user

        // Verify that the service method throws an IllegalArgumentException when the user is null
        assertThrows(IllegalArgumentException.class, () -> {
            userService.saveUser(user);
        });
    }

    @Test
    void getUserById() {

            User user = new User();
            user.setId(101L);
            user.setEmail("abc@gmail.com");
            user.setUsername("Ram");


            when(userRepository.findById(101L)).thenReturn(Optional.of(user));

            User user1 = userService.getUserById(101L);

            assertEquals(101L,user1.getId());
            assertEquals("abc@gmail.com",user1.getEmail());
            assertEquals("Ram",user1.getUsername());

        }

    @Test
    void saveUserFailedb() {
        User user = null; // Test with a null user

        // Verify that the service method throws an IllegalArgumentException when the user is null
        assertThrows(RuntimeException.class, () -> {
            userService.getUserById(1L);
        });
    }

}