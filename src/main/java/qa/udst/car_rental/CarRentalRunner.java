package qa.udst.car_rental;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import qa.udst.car_rental.model.Car;
import qa.udst.car_rental.service.VehicleService;

@Component
public class CarRentalRunner implements CommandLineRunner{

    private final VehicleService vehicleService;

    private CarRentalRunner(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car(1, "Toyota", "Camry", 2006, 5);
        Car c2 = new Car(2, "Honda", "Civic", 2012, 5);
        vehicleService.addVehicle(c1);
        vehicleService.addVehicle(c2);
    }
    
}
