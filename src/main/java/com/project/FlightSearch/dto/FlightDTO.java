package com.project.FlightSearch.dto;

import lombok.Data;
import java.time.ZonedDateTime;

@Data
public class FlightDTO {
    private Long id;
    private String departureAirport;
    private String arrivalAirport;
    private ZonedDateTime departureDatetime;
    private ZonedDateTime returnDatetime;
    private double price;
}




