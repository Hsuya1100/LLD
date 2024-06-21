package com.parking;

import java.util.*;
import com.parking.vehicle.VehicleType;
import com.parking.vehicle.Car;
import com.parking.vehicle.Truck;
import com.parking.vehicle.Bike;
import com.parking.vehicle.Vehicle;
public class Main {

    public static void main(String[] args) {
        //TODO
        // service
        //create vehicles
        Vehicle car1 = new Car("c1");
        Vehicle car2 = new Car("c2");
        Vehicle car3 = new Car("c3");
        Vehicle car4 = new Car("c4");
        Vehicle car5 = new Car("c5");
        Vehicle car6 = new Car("c6");
        Vehicle car7 = new Car("c7");


        Vehicle bike1 = new Bike("b1");
        Vehicle bike2 = new Bike("b2");
        Vehicle bike3 = new Bike("b3");

        Vehicle truck1 = new Truck("t1");
        Vehicle truck2 = new Truck("t2");
        Vehicle truck3 = new Truck("t3");

        ParkingLot parkingService = ParkingLot.getInstance();
        Level level1 = new Level(1, 2);
        Level level2 = new Level(2, 1);
        Level level3 = new Level(3, 1);

        parkingService.addLevel(level1);
        parkingService.addLevel(level2);
        parkingService.addLevel(level3);

        //parking starts
        System.out.println(parkingService.parkVehicle(car1));
        System.out.println(parkingService.parkVehicle(car2));
        parkingService.displayAvailiblity();

        System.out.println(parkingService.unparkVehicle(car2));
        parkingService.displayAvailiblity();


        System.out.println(parkingService.parkVehicle(car3));
        System.out.println(parkingService.parkVehicle(car4));
        System.out.println(parkingService.parkVehicle(car5));
        System.out.println(parkingService.parkVehicle(car6));
        System.out.println(parkingService.parkVehicle(car7));
        parkingService.displayAvailiblity();

        parkingService.unparkVehicle(car4);
        parkingService.displayAvailiblity();




    }
}

