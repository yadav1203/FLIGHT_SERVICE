package com.CodeTech.Flight.Service.Repository;

import com.CodeTech.Flight.Service.Entiry.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {


    Flight findByOriginAndDestination(String origin, String destination);
}
