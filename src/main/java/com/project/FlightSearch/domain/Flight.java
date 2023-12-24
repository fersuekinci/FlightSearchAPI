package com.project.FlightSearch.domain;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "flights")
@Data
@Builder
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "departure_airport")
    private String departureAirport;

    @Column(name = "arrival_airport")
    private String arrivalAirport;

    @Column(name = "departure_datetime")
    private ZonedDateTime departureDatetime;

    @Column(name = "return_datetime")
    private ZonedDateTime returnDatetime;

    @Column(name = "price")
    private double price;
}
