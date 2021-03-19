package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Bob",2,3);
        Engine engine = new Engine();
        engine.setPower(34);
        engine.setCompany("Z");
        Car car = new Car();
        car.setBrand("Jeep");
        car.printInfo1(car,driver,engine);
    }
}
