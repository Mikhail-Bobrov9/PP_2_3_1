package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class CarServiceImp implements CarService {

    private final CarDAO carDAO;

    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public  List<Car> getCountCars(Integer count) {

        Stream<Car> stream = carDAO.getCars().stream();
        List<Car> cars1 = stream.limit(count).collect(Collectors.toList());

        return cars1;
    }
}
