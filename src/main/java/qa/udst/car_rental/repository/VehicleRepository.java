package qa.udst.car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import qa.udst.car_rental.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    // Common vehicle-related queries
}
