package qa.udst.car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import qa.udst.car_rental.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
