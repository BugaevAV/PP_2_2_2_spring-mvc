package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car(1, "Mercedes", "C W205"));
        cars.add(new Car(2, "Audi", "Q6"));
        cars.add(new Car(3, "BMW", "i8"));
        cars.add(new Car(4, "Газ", "69"));
        cars.add(new Car(5, "Lada", "2101"));
    }

    public List<Car> getCars(Optional<Integer> carsQuantity) {
        return carsQuantity.map(i -> {
            if (i <= cars.size()) {
                return cars.subList(0, i);
            } else {
                return cars;
            }
        }).orElseGet(() -> cars);
    }
}
