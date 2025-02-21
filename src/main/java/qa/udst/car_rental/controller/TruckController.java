package qa.udst.car_rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import qa.udst.car_rental.model.Truck;
import qa.udst.car_rental.service.TruckService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trucks")
public class TruckController {

    @Autowired
    private TruckService truckService;

    @GetMapping
    public List<Truck> getAllTrucks() {
        return truckService.getAllTrucks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Truck> getTruckById(@PathVariable int id) {
        Optional<Truck> truck = truckService.getTruckById(id);
        return truck.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Truck createTruck(@RequestBody Truck truck) {
        return truckService.saveTruck(truck);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTruck(@PathVariable int id) {
        truckService.deleteTruck(id);
        return ResponseEntity.noContent().build();
    }
}
