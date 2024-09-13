//package com.CodeTech.Flight.Service.Service;
//
////import com.CodeTech.Flight.Service.Entiry.Flight;
//import com.CodeTech.Flight.Service.Repository.FlightRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//class FlightServiceTest {
//
//
//    @InjectMocks
//    private  FlightService flightService;
//
//    @Mock
//    private FlightRepository flightRepository;
//    @BeforeEach
//
//    void setUp() {
//        AutoCloseable autoCloseable = MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void searchFlights() {
//
//
//
//        Flight flight = Flight.builder()
//                .id(101L)
//                .origin("NVL")
//                .destination("HBL")
//                .arrivalDate("11-03-2024")
//                .departureDate("12-03-2024")
//                .price(1000L)
//                .build();
//        when(flightRepository.findByOriginAndDestination("NVL","HBL")).thenReturn((flight));
//
//         Flight flightpath = flightService.searchFlights(flight.getOrigin(),flight.getDestination());
//
//        assertNotNull(flightpath);
//        Assertions.assertEquals("11-03-2024", flightpath.getArrivalDate());
//    }
//
//    @Test
//    void createFlight() {
//    }
//
//    @Test
//    void updateFlight() {
//        // Given
//        Flight existingFlight = Flight.builder()
//                .id(101L)
//                .origin("NVL")
//                .destination("HBL")
//                .arrivalDate("2024-03-11")
//                .departureDate("2024-03-12")
//                .price(1000L)
//                .build();
//
//        Flight updatedFlight = Flight.builder()
//                .id(101L) // Ensure the ID matches
//                .origin("KGL")
//                .destination("NRD")
//                .arrivalDate("2024-03-01")
//                .departureDate("2024-03-01")
//                .price(1000L)
//                .build();
//
//        // Mock behavior
//        when(flightRepository.findById(101L)).thenReturn(Optional.of(existingFlight));
//        when(flightRepository.save(existingFlight)).thenReturn(updatedFlight);
//
//        // Act
//        Flight result = flightService.updateFlight(101L, updatedFlight);
//
//        // Assert
//        assertNotNull(result, "The result should not be null");
//        assertEquals("KGL", result.getOrigin());
//        assertEquals("NRD", result.getDestination());
//        assertEquals("2024-03-01", result.getArrivalDate());
//        assertEquals("2024-03-01", result.getDepartureDate());
//        assertEquals(1000L, result.getPrice());
//    }
//
//    @Test
//    void upadteFlightNotFound() {
//
//        Flight updatedFlight = Flight.builder()
//                .id(101L) // ID should match the one we are querying
//                .origin("KGL")
//                .destination("NRD")
//                .arrivalDate("2024-03-01")
//                .departureDate("2024-03-01")
//                .price(1000L)
//                .build();
//
//        // Mock behavior
//        when(flightRepository.findById(101L)).thenThrow(  new RuntimeException("FLIGHT NOT FOUND"));
//
//        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
//
//                    flightService.updateFlight(101L, updatedFlight);
//                });
//        assertEquals("FLIGHT NOT FOUND", thrown.getMessage());
//
//
//    }
//}