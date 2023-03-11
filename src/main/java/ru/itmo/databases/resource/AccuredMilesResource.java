package ru.itmo.databases.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itmo.databases.model.Flight;
import ru.itmo.databases.service.AccuredMilesService;

@RestController
@RequestMapping("/api/loyalti/miles")
public class AccuredMilesResource {
    private final AccuredMilesService accuredMilesService;

    public AccuredMilesResource(AccuredMilesService accuredMilesService) {
        this.accuredMilesService = accuredMilesService;
    }

    @PostMapping("/updateMilesBalance")
    public Flight submitOrderForPoints(@RequestBody Flight flight) {
        return accuredMilesService.updateFlightRecordWithMiles(flight);
    }
}