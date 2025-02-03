package com.example.AirlineReservationSystem.Service;

import com.example.AirlineReservationSystem.Entity.Passenger;
import com.example.AirlineReservationSystem.Repo.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}