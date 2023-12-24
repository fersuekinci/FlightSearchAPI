package com.project.FlightSearch.controller;

import com.project.FlightSearch.dto.FlightDTO;
import com.project.FlightSearch.service.FlightSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.ZonedDateTime;
import java.util.List;

@RestController
@RequestMapping("/search/flights")
@RequiredArgsConstructor
public class FlightSearchController {
    private final FlightSearchService flightSearchService;
    @GetMapping
    public ResponseEntity<List<FlightDTO>> getFlights(@RequestParam String departureCity, @RequestParam String arrivalCity,
                                                      @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime departureDate,
                                                      @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime returnDate) {
        List<FlightDTO> flightDTOs = flightSearchService.getFlights(departureCity, arrivalCity, departureDate, returnDate);
        return ResponseEntity.ok(flightDTOs);
    }
}
