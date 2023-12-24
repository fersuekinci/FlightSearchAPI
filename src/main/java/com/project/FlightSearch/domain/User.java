package com.project.FlightSearch.domain;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
}
