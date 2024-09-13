//package com.CodeTech.Flight.Service.Controller;
//
//import com.CodeTech.Flight.Service.Entiry.Users;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@WebMvcTest(UserController.class)
//class UserControllerTest {
//
//    @MockBean
//    private UserService userService;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    private Users user;
//
//    @BeforeEach
//    void setUp() {
//        user = Users.builder()
//                .email("Rayar@gmail.com")
//                .name("Rayaru")
//                .id(101)
//                .address("MLY TL")
//                .age(19)
//                .build();
//    }
//
//    @Test
//    void importJsonFile() throws Exception {
//        // Convert the user object to a JSON string
//        String userJson = new ObjectMapper().writeValueAsString(user);
//
//        // Perform a POST request and expect a 200 OK status
//        mockMvc.perform(post("/import")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(userJson))
//                .andExpect(status().isOk());
//    }
//}
