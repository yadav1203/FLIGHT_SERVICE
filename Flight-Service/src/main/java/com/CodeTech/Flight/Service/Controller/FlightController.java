package com.CodeTech.Flight.Service.Controller;


import com.CodeTech.Flight.Service.Entiry.Flight;
import com.CodeTech.Flight.Service.Entiry.User;
import com.CodeTech.Flight.Service.Error.ResourceNotFoundException;
import com.CodeTech.Flight.Service.Service.FlightService;
import com.CodeTech.Flight.Service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;
    @Autowired
    private UserService userService;



    @GetMapping
    public Flight searchFlights(@RequestParam String origin, @RequestParam String destination) {
        if (origin.isEmpty()){

            throw new ResourceNotFoundException("ORIGIN IS NOT PRESENT " + destination);
        }




        return flightService.searchFlights(origin, destination);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @PutMapping("/{id}")
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight flight) {
        return flightService.updateFlight(id, flight);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }

}
