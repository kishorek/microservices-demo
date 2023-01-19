package com.msdemo.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "from_place")
    private String from;

    @Column(name = "to_place")
    private String to;

    private RideStatus rideStatus;
}

enum RideStatus {
    RIDE_ACCEPTED, RIDE_REJECTED, RIDE_PENDING
}