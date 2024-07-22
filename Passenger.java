package org.example;

public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;

    //constructors

    public Passenger() {
    }

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //Getters Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    //Methods
    public abstract void reserveCar(Car car) throws Exception;

    public void printInfo() {
        System.out.println(
                "\nPassenger Name: " + getName() +
                        "\nPassenger ID: " + getId() +
                        "\nPassenger Reserved Car Code: " + reservedCar.getCode() +
                        "\nPassenger Route Price: $" + tripCost
        );
    }
}
