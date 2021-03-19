package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private char classCar;
    private long weight;
    private Driver driver;
    private Engine engine;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public char getClassCar() {
        return classCar;
    }

    public void setClassCar(char classCar) {
        this.classCar = classCar;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classCar=" + classCar +
                ", weight=" + weight +
                '}';
    }

    public void printInfo1(Car car, Driver driver, Engine engine) {
        System.out.printf(driver.toString() + "\n" + engine.toString() + "\n" + car.toString());
    }
}
