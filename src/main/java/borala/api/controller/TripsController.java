package borala.api.controller;

import borala.api.trip.DataGetTrip;
import borala.api.trip.DataRegisterTrip;
import borala.api.trip.TripRepository;
import borala.api.trip.trip;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips")
public class TripsController {

    @Autowired
    private TripRepository repository;
    @PostMapping
    @Transactional
    public void addTrip(@RequestBody @Valid DataRegisterTrip data){
        repository.save(new trip(data));
    }

    @GetMapping
    public List<DataGetTrip> listTrips(){
        return repository.findAll().stream().map(DataGetTrip::new).toList();

    }
}
