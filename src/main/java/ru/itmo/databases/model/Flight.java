package ru.itmo.databases.model;

import lombok.Data;

@Data
public class Flight {
    String user;
    LoyalityStatus loyalityStatus;
    Integer flightDistance;
    Integer milesAccountPerFlight;
}