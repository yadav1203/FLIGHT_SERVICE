package com.CodeTech.Flight.Service.Service;


import com.CodeTech.Flight.Service.Entiry.Flight;
import com.CodeTech.Flight.Service.Error.ResourceNotFoundException;
import com.CodeTech.Flight.Service.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    //SEARCH FLIGHT
    public Flight searchFlights(String origin, String destination) {

        return flightRepository.findByOriginAndDestination(origin, destination);

    }

    //  // Additional methods for CRUD operations


    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }


    public Flight updateFlight(Long id, Flight flight) {

        Flight existingFlight = flightRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("FLIGHT NOT FOUND"));

        return flightRepository.save(existingFlight);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

}
