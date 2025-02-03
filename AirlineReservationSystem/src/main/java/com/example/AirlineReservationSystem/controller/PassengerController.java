package com.example.AirlineReservationSystem.controller;

import com.example.AirlineReservationSystem.Entity.Passenger;
import com.example.AirlineReservationSystem.Service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("/passenger")
    public String savePassenger(@RequestBody Passenger passenger) {
        passengerService.savePassenger(passenger);
        return "redirect:/payment.html";
    }
}