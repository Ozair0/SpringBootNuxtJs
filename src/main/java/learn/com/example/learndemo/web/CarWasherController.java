package learn.com.example.learndemo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.com.example.learndemo.model.Car;
import learn.com.example.learndemo.model.Driver;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api")
public class CarWasherController {
    List<Car> cars = new ArrayList<Car>();

    public CarWasherController() {
        Driver driver1 = new Driver(1, "Ozair", "Farahi", "Phone1", "Address1");
        Driver driver2 = new Driver(2, "Noor", "Khan", "Phone2", "Address2");

        Car car1 = new Car(1, "Fiat", "Red", driver1, 2018);
        Car car2 = new Car(2, "Firari", "Blue", driver2, 2019);

        cars.add(car1);
        cars.add(car2);
    }

    @RequestMapping("/cars")
    public List<Car> getCars() {

        return cars;
    }

    @PostMapping("/cars")

    public List<Car> addCars() {

        Driver driver1 = new Driver(3, "Merwais", "Khan", "Phone11", "Address11");
        Driver driver2 = new Driver(4, "Nabi", "Amaj", "Phone22", "Address22");

        Car car1 = new Car(3, "BMW", "Gray", driver1, 2020);
        Car car2 = new Car(4, "Motrola", "Yellow", driver2, 2021);

        cars.add(car1);
        cars.add(car2);
        return cars;

    }

}
