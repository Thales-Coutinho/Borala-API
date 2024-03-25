package borala.api.controller;

import borala.api.trip.DataRegisterTrip;
import borala.api.trip.TripRepository;
import borala.api.trip.trip;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class TripsController {

    @Autowired
    private TripRepository repository;
    @PostMapping
    @Transactional
    public void addTrip(@RequestBody @Valid DataRegisterTrip data){
        System.out.println(data.local());
        repository.save(new trip(data));

    }
}
