package org.example;

public class Car {
    private String code;
    private final Route route;
    private int maxCapacity;

    //constructors
    public Car(String code, Route route, int maxCapacity) {
        this.code = code;
        this.route = route;
        this.maxCapacity = maxCapacity;
    }
    //Getters Setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
