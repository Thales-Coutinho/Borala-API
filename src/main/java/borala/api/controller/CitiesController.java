package borala.api.controller;

import borala.api.city.CityRepository;
import borala.api.city.DataGetCity;
import borala.api.trip.DataGetTrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CitiesController {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public List<DataGetCity> listTrips(){
        return repository.findAll().stream().map(DataGetCity::new).toList();
    }
}
