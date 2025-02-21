package qa.udst.car_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qa.udst.car_rental.model.Car;
import qa.udst.car_rental.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(int id) {
        return carRepository.findById(id);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }
}
