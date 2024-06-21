package com.parking;

import java.util.ArrayList;
import java.util.List;

import com.parking.vehicle.Vehicle;

public class ParkingLot {
    private static ParkingLot s_instance;
    private List<Level> levels;

    public synchronized static ParkingLot getInstance() {
        if (s_instance == null)
            s_instance = new ParkingLot();
        return s_instance;
    }
    private ParkingLot() {
        levels = new ArrayList<Level>();
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level: levels) {
            if (level.parkVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for (Level level: levels) {
            if (level.unparkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public void displayAvailiblity() {
        for (Level level: levels) {
            level.displayAvailableSlots();
        }
    }
}
