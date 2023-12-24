package com.project.FlightSearch.repository;

import com.project.FlightSearch.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.ZonedDateTime;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDepartureAirportAndArrivalAirportAndDepartureDatetime(
            String departureAirport, String arrivalAirport, ZonedDateTime departureDatetime);

    List<Flight> findByDepartureAirportAndArrivalAirportAndDepartureDatetimeAndReturnDatetime(
            String departureAirport, String arrivalAirport, ZonedDateTime departureDatetime, ZonedDateTime returnDatetime);
}
