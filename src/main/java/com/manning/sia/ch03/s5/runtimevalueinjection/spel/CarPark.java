package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component("carPark")
public class CarPark {
    private List<Car> cars = new ArrayList<>();
    private Map<String, Car> carsByDriver = new HashMap<>();

    public CarPark() {
        Car model1 = new Car();
        model1.setMake("Good company");
        model1.setModel("Model1");
        model1.setYearOfProduction(1998);

        Car model2 = new Car();
        model2.setMake("Good company");
        model2.setModel("Model2");
        model2.setYearOfProduction(2005);

        Car model3 = new Car();
        model3.setMake("Good company");
        model3.setModel("Model1");
        model3.setYearOfProduction(2015);

        cars.add(model1);
        cars.add(model2);
        cars.add(model3);

        carsByDriver.put("Driver1", model1);
        carsByDriver.put("Driver2", model2);
        carsByDriver.put("Driver2", model3);
    }
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Map<String, Car> getCarsByDriver() {
        return carsByDriver;
    }

    public void setCarsByDriver(Map<String, Car> carsByDriver) {
        this.carsByDriver = carsByDriver;
    }
}
