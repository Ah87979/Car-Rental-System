package qa.udst.car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import qa.udst.car_rental.model.Truck;

public interface TruckRepository extends JpaRepository<Truck, Integer> {
}
