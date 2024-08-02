package web.service;

import web.models.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getCars(Optional<Integer> carsQuantity);
}
