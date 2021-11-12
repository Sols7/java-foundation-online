package ru.itsjava.statics;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class Car {
    private final String brandCar;
    private String colorCar;
    private static double priceCar = 500_000.0;

    public double getPriceCar(){
        return priceCar;
    }
}
