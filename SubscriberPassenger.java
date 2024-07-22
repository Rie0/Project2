package org.example;

public class SubscriberPassenger extends Passenger{
    private final static double subscriberDiscount=0.50;

    //constructors
    public SubscriberPassenger(String name, String id) {
        super(name, id);
    }

    //Methods
    @Override
    public void reserveCar(Car car) throws Exception{
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Maximum number of passengers cannot be zero.");
        }else {
            this.setReservedCar(car);
            this.setTripCost(car.getRoute().getTripPrice()*subscriberDiscount); //%50 discount
           car.setMaxCapacity(car.getMaxCapacity()-1);
        }


    }

    public void printInfo() {
        System.out.println(
                "\nPassenger Name: " + getName() +
                        "\nPassenger type: Subscribed"+
                        "\nPassenger ID: " + getId() +
                        "\nPassenger Reserved Car Code: " + getReservedCar().getCode() +
                        "\nPassenger Route Price: $" + getTripCost()
        );
    }
}
