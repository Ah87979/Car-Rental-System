package qa.udst.car_rental;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import qa.udst.car_rental.model.Car;
import qa.udst.car_rental.model.Truck;
import qa.udst.car_rental.service.CarService;
import qa.udst.car_rental.service.TruckService;

@Component
public class CarRentalRunner implements CommandLineRunner{

    private final CarService carService;
    private final TruckService truckService;

    public CarRentalRunner(CarService carService, TruckService truckService) {
        this.carService = carService;
        this.truckService = truckService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Seeding database with test data...");

        // Add sample cars
        Car car1 = new Car("Toyota", "Camry", 2022, 5);
        Car car2 = new Car("Honda", "Civic", 2021, 5);
        carService.saveCar(car1);
        carService.saveCar(car2);

        // Add sample trucks
        Truck truck1 = new Truck("Ford", "F-150", 2023, 1.5);
        Truck truck2 = new Truck("Chevrolet", "Silverado", 2020, 2.0);
        truckService.saveTruck(truck1);
        truckService.saveTruck(truck2);

        // Print saved data
        System.out.println("Cars in the database:");
        carService.getAllCars().forEach(car -> 
            System.out.println(car.getId() + " - " + car.getManufacturer() + " " + car.getModel())
        );

        System.out.println("Trucks in the database:");
        truckService.getAllTrucks().forEach(truck -> 
            System.out.println(truck.getId() + " - " + truck.getManufacturer() + " " + truck.getModel())
        );

        System.out.println("Database seeding complete.");
    }
    
}
