package borala.api.controller;

import borala.api.trip.DataRegisterTrip;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class TripsController {
    @PostMapping
    public void addTrip(@RequestBody DataRegisterTrip data){
        System.out.println(data.price());

    }
}
