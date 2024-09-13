//package com.CodeTech.Flight.Service.Controller;
//
//import com.CodeTech.Flight.Service.Entiry.Flight;
//import com.CodeTech.Flight.Service.Service.FlightService;
//import com.CodeTech.Flight.Service.Controller.FlightController;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//
//import static org.hamcrest.Matchers.is;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(FlightController.class)
//public class FlightControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private FlightService flightService;
//
//    @Test
//    void createFlightWithEqMatcher() throws Exception {
//        Flight flight = Flight.builder()
//                .id(6L)
//                .price(1200)
//                .destination("HBL")
//                .origin("NVL")
//                .arrivalDate("2024-01-10T07:00:00Z")
//                .departureDate("2024-01-10T09:00:00Z")
//                .build();
//
//        // Mock service behavior
//        when(flightService.createFlight(any(Flight.class))).thenReturn(flight);
//
//        // Test POST endpoint
//        mockMvc.perform(post("/flight")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"origin\":\"NVL\",\"destination\":\"HBL\",\"departureDate\":\"2024-01-10T09:00:00Z\",\"arrivalDate\":\"2024-01-10T07:00:00Z\",\"price\":1200}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", is(6)))
//                .andExpect(jsonPath("$.price", is(1200.0)))
//                .andExpect(jsonPath("$.destination", is("HBL")))
//                .andExpect(jsonPath("$.origin", is("NVL")));
//    }
//
//
//
//    @Test
//    void searchFlightsTest() throws Exception {
//        // Arrange: Set up the flight object
//        Flight flight = Flight.builder()
//                .id(9L)
//                .price(1400)
//                .destination("XXX")
//                .origin("NVL")
//                .arrivalDate("2024-01-10T07:00:00Z")
//                .departureDate("2024-01-10T09:00:00Z")
//                .build();
//
//        // Define parameters for the request
//        String origin = "NVL";
//        String destination = "XXX";
//
//        // Mock the service method to return the flight object
//        when(flightService.searchFlights(origin, destination)).thenReturn(flight);
//
//        // Act: Perform the GET request
//        MvcResult result = mockMvc.perform(get("/flight")
//                        .param("origin", origin)
//                        .param("destination", destination))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id", is(9)))
//                .andExpect(jsonPath("$.price", is(1400.0)))
//                .andExpect(jsonPath("$.destination", is("XXX")))
//                .andExpect(jsonPath("$.origin", is("NVL")))
//                .andReturn();
//
//        // Optionally print the response body to debug
//        System.out.println(result.getResponse().getContentAsString());
//    }
//}
