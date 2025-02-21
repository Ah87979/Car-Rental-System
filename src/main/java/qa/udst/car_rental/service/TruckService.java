package qa.udst.car_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qa.udst.car_rental.model.Truck;
import qa.udst.car_rental.repository.TruckRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TruckService {

    @Autowired
    private TruckRepository truckRepository;

    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public Optional<Truck> getTruckById(int id) {
        return truckRepository.findById(id);
    }

    public Truck saveTruck(Truck truck) {
        return truckRepository.save(truck);
    }

    public void deleteTruck(int id) {
        truckRepository.deleteById(id);
    }
}
