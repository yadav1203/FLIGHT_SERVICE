package com.CodeTech.Flight.Service.Service;

import com.CodeTech.Flight.Service.Entiry.User;
import com.CodeTech.Flight.Service.Entiry.UserData;
import com.CodeTech.Flight.Service.Repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserDataProcessingServiceImplTest {


    @InjectMocks
    private UserDataProcessingServiceImpl userDataProcessingService;

    @Mock
    private ExternalValidationService externalValidationService;

    @Mock
    private UserRepository userRepository;


    private User user;


    @BeforeEach
    void setup() {

        user = User.builder()
                .email("abc@gmail.com")
                .username("Ram")
                .id(10L)
                .build();

        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void processUserDataTest() {
        UserData userData = new UserData();
        userData.setUsername("abc");
        userData.setEmail("xyz@gmail.com");


        verify(userRepository, calls(1)).save(user);


    }

}