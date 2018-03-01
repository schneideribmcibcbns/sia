package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelCollections")
public class SpelCollections {
    @Value("#{carPark.carsByDriver['Driver1']}")
    private Car driver1Car;
    @Value("#{carPark.carsByDriver['Driver2']}")
    private Car driver2Car;
    @Value("#{carPark.cars[0]}")
    private Car firstCarInPark;
    @Value("#{carPark.cars.size()}")
    private Integer numberOfCarsInPark;
    @Value("#{carPark.cars.?[model eq 'Model1']}")
    private List<Car> model1;
    @Value("#{carPark.cars.^[model eq 'Modle1']}")
    private Car firstModel1;
    @Value("#{carPark.cars.$[model eq 'Model1']}")
    private Car secondModel1;
    @Value("#{carPark.cars.![yearOfProduction]}")
    private List<Integer> years;

    @Override
    public String toString() {
        return "[" +
                "driver1Car=" + driver1Car +
                ", driver2Car=" + driver2Car +
                ", firstCarInPark=" + firstCarInPark +
                ", numberOfCarsInPark=" + numberOfCarsInPark +
                ", model1 cars = " + model1 + 
                ", first model1 = " + firstModel1 +
                ", second model1 = " + secondModel1 +
                ", years = " + years +
                ']';
    }
}