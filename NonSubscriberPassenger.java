package org.example;

public class NonSubscriberPassenger extends Passenger {
    private boolean hasDiscountCoupon;

    //constructors
    public NonSubscriberPassenger(String name, String id, boolean hasDiscountCoupon) {
        super(name, id);
        this.hasDiscountCoupon = hasDiscountCoupon;
    }

    //Getters Setters
    public boolean isHasDiscountCoupon() {
        return hasDiscountCoupon;
    }

    public void setHasDiscountCoupon(boolean hasDiscountCoupon) {
        this.hasDiscountCoupon = hasDiscountCoupon;
    }

    //Methods
    @Override
    public void reserveCar(Car car) throws Exception{
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Maximum number of passengers cannot be zero.");
        }

        this.setReservedCar(car);
        if (hasDiscountCoupon) {
            this.setTripCost((car.getRoute().getTripPrice()) - car.getRoute().getTripPrice() * 0.1); //%10 discount
        } else {
            this.setTripCost(car.getRoute().getTripPrice());
        }
    }

    public void printInfo() {
        System.out.println(
                "\nPassenger Name: " + getName() +
                        "\nPassenger type: Non-Subscribed" +
                        "\nPassenger Has Coupon: " + isHasDiscountCoupon() +
                        "\nPassenger ID: " + getId() +
                        "\nPassenger Reserved Car Code: " + getReservedCar().getCode() +
                        "\nPassenger Route Price: $" + getTripCost()
        );
    }
}
