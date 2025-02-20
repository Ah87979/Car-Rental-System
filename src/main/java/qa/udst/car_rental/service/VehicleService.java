package qa.udst.car_rental.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import qa.udst.car_rental.model.Vehicle;

@Service
public class VehicleService {

    List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public ArrayList<Vehicle> getAllVehicles() {
        return new ArrayList<Vehicle>(this.vehicles);
    }
    
    public Vehicle getVehicleById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void updateVehicle(int id, Vehicle updatedVehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == id) {
                vehicles.set(i, updatedVehicle);
                return;
            }
        }
    }

    public void deleteVehicle(int id) {
        vehicles.removeIf(vehicle -> vehicle.getId() == id);
    }

}
