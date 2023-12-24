package com.project.FlightSearch.service;

import com.project.FlightSearch.domain.Flight;
import org.springframework.stereotype.Service;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class MockService {
    public List<Flight> fetchFlightData() {
        Flight flight1 = Flight.builder()
                .departureAirport("IST")
                .arrivalAirport("JFK")
                .departureDatetime(ZonedDateTime.parse("2023-01-01T12:00:00Z"))
                .returnDatetime(ZonedDateTime.parse("2023-01-01T18:00:00Z"))
                .price(500.0)
                .build();

        Flight flight2 = Flight.builder()
                .departureAirport("LHR")
                .arrivalAirport("SFO")
                .departureDatetime(ZonedDateTime.parse("2023-01-02T10:00:00Z"))
                .returnDatetime(ZonedDateTime.parse("2023-01-02T16:00:00Z"))
                .price(600.0)
                .build();

        return Arrays.asList(flight1, flight2);
    }
}
