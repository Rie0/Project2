package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//Object creation
        Route route1 = new Route("Jeddah","Makkah",220.0);
        Route route2 = new Route("Riyadh","Dammam",240.0);

        Car car1 = new Car("FJD098",route1,5);
        Car car2 = new Car("JSG736",route2,0); //causes exception.

        Passenger passenger1 = new SubscriberPassenger("Salma","8357");
        Passenger passenger2 = new NonSubscriberPassenger("Sara","4562",true);

//Create an array
        ArrayList<Passenger> passengers =new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);

//Implementing methods
        try {
            passenger1.reserveCar(car1);
            passenger2.reserveCar(car2);
            for (Passenger passenger: passengers){
                passenger.printInfo();
            }
        } catch (Exception e){
            System.out.println("An exception occurred, cause: "+e.getMessage());
        }



    }
}