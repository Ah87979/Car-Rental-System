package qa.udst.car_rental.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import qa.udst.car_rental.model.Car;
import qa.udst.car_rental.model.Truck;
import qa.udst.car_rental.model.Vehicle;
import qa.udst.car_rental.service.VehicleService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private VehicleService vehicleService;
    
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
    
    @GetMapping("/all")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable int id) {
        return vehicleService.getVehicleById(id);
    }
    
    @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            vehicleService.addVehicle(car);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            vehicleService.addVehicle(truck);
        }
    }

    @PutMapping("/{id}")
    public void updateVehicle(@PathVariable int id, @RequestBody Vehicle vehicle) {
        vehicleService.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable int id) {
        vehicleService.deleteVehicle(id);
    }

}
