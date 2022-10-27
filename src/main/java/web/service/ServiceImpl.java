package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceImpl implements CarService {
    private final List<Car> cars = Arrays.asList(
                new Car("model1", 1, "owner1"),
                new Car("model2", 2, "owner2"),
                new Car("model3", 3, "owner3"),
                new Car("model4", 4, "owner4"),
                new Car("model5", 5, "owner5"));

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count < 5 && count > 0 ? count : 5);
    }
}
