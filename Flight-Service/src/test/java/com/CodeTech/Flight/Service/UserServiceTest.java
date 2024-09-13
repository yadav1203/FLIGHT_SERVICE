//package com.CodeTech.Flight.Service;
//
//import com.CodeTech.Flight.Service.Entiry.User;
//import com.CodeTech.Flight.Service.Repository.UserRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.Collections;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//class UserServiceTest {
//
//
//
//    @Mock
//    private UserRepository userRepository;
//
//
//    @InjectMocks
//    private UserService userService;
//
//    private User user;
//
//    @BeforeEach
//    void setUp() {
//        AutoCloseable autoCloseable = MockitoAnnotations.openMocks(this);
//
//
//
//    }
//
//    @Test
//    void createUser() {
//
//        User user = User.builder()
//                .id(1L)
//                .name("YADAV")
//                .email("yadava@gmail.com")
//                .password("123@")
//                .build();
//
//        when(userRepository.save(user)).thenReturn(user);
//
//        User createuser = userService.createUser(user);
//
//        assertEquals("YADAV",createuser.getName());
//
//
//
//
//    }
//
//    @Test
//    void updateUser() {
//
//        User user = User.builder()
//                .id(1L)
//                .name("YADAV")
//                .email("yadava@gmail.com")
//                .password("123@")
//                .build();
//
//        // Given
//        User updatedUser = User.builder()
//                .id(1L)
//                .name("John Smith")
//                .email("john.smith@example.com")
//                .password("password1234")
//                .build();
//        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
//
//         when(userRepository.save(any(User.class))).thenReturn(updatedUser);
//
//
//         User result = userService.updateUser(1L, updatedUser);
//
//         assertNotNull(result);
//           assertEquals("john.smith@example.com",result.getEmail());
//
//
//
//    }
//
//    @Test
//    void findUserById() {
//
//        User user = User.builder()
//                .id(1L)
//                .name("YADAV")
//                .email("yadava@gmail.com")
//                .password("123@")
//                .build();
//        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
//
//        User findUserById= userService.findUserById(1L);
//
//        assertNotNull(findUserById);
//        assertEquals("yadava@gmail.com",findUserById.getEmail());
//
//
//
//    }
//
//    @Test
//    void deleteUser() {
//
//        User user = User.builder()
//                .id(1L)
//                .name("YADAV")
//                .email("yadava@gmail.com")
//                .password("123@")
//                .build();
//
//
//        when(userRepository.existsById(1L)).thenReturn(true);
//        userService.deleteUser(1L);
//
//        verify(userRepository, times(1)).deleteById(1L);
//
//    }
//
//    @Test
//    void deleteUserException() {
//
////        User user = User.builder()
////                .id(1L)
////                .name("YADAV")
////                .email("yadava@gmail.com")
////                .password("123@")
////                .build();
//
//
//        when(userRepository.existsById(1L)).thenReturn(false);
//
//        assertThrows(RuntimeException.class, () -> {
//
//            userService.deleteUser(1L);
//        });
//
//        verify(userRepository, never()).deleteById(1L);
//
//    }
//}