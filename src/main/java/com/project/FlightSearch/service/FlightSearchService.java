package com.project.FlightSearch.service;

import com.project.FlightSearch.domain.Flight;
import com.project.FlightSearch.dto.FlightDTO;
import com.project.FlightSearch.mapper.FlightMapper;
import com.project.FlightSearch.repository.FlightRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.ZonedDateTime;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Transactional
public class FlightSearchService {
    private FlightRepository flightRepository;
    private FlightMapper flightMapper;
    private MockService mockService;

    public List<FlightDTO> getFlights(String departureCity, String arrivalCity, ZonedDateTime departureDate, ZonedDateTime returnDate) {
        List<Flight> flights;

        if (returnDate != null) {
            flights = flightRepository.findByDepartureAirportAndArrivalAirportAndDepartureDatetimeAndReturnDatetime(
                    departureCity, arrivalCity, departureDate, returnDate);
        } else {
            flights = flightRepository.findByDepartureAirportAndArrivalAirportAndDepartureDatetime(
                    departureCity, arrivalCity, departureDate);
        }
        return flightMapper.toDto(flights);
    }

    public void saveFlights(List<Flight> flights) {
        flightRepository.saveAll(flights);
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void fetchAndSaveFlightData() {
        List<Flight> flights = mockService.fetchFlightData();
        saveFlights(flights);
    }
}
