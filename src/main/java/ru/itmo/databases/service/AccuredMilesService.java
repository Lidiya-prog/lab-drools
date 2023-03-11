package ru.itmo.databases.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import ru.itmo.databases.model.Flight;
import ru.itmo.databases.model.FlightMiles;

public class AccuredMilesService {

    private final KieContainer kieContainer;

    public AccuredMilesService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Flight updateFlightRecordWithMiles(Flight flight) {
        flight.setMilesAccountPerFlight(getMilePerFlight(flight).getMiles());

        return flight;
    }

    private FlightMiles getMilePerFlight(Flight flight) {
        FlightMiles flightMiles = new FlightMiles();

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal(FlightMiles.class.getSimpleName(), flightMiles);
        kieSession.insert(flight);
        kieSession.fireAllRules();
        kieSession.dispose();

        return flightMiles;
    }
}