package web.dao;


import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImp implements CarDAO {

    private static  int CAR_COUNT;

    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "BMW", "WHITE"));
        cars.add(new Car(++CAR_COUNT, "MB", "RED"));
        cars.add(new Car(++CAR_COUNT, "Skoda", "GREEN"));
        cars.add(new Car(++CAR_COUNT, "AUDI", "ORANGE"));
        cars.add(new Car(++CAR_COUNT, "OPEL", "GREY"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
