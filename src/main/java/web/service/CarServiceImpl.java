package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> CARS = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("BMW", "X5", 2019),
            new Car("Mercedes", "C-Class", 2021),
            new Car("Audi", "A6", 2018),
            new Car("Honda", "Accord", 2022)
    );

    public List<Car> getCars(int count) {
        return CARS.subList(0, Math.min(count, CARS.size())); 
    }
}
