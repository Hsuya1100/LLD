package com.parking;

import java.util.*;

import com.parking.vehicle.Vehicle;

public class Level {
    private final int floor;
    private final List<Slot> slots;

    public Level(int floor, int numSpots) {
        this.floor = floor;
        slots = new ArrayList<Slot>();
        for (int i =0; i<numSpots; i++) {
            slots.add(new Slot(i));
        }
    }

    public int getSlotCount() {
        return slots.size();
    }

    public int getFloor() {
        return this.floor;
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (Slot slot: slots) {
            if (slot.isAvailable() && slot.getVehicleType() == vehicle.getVehicleType()) {
                slot.park(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for (Slot slot: slots) {
            if (!slot.isAvailable() && slot.getParkedVehicle().equals(vehicle)) {
                slot.unpark();
                return true;
            }
        }
        return false;
    }
    public void displayAvailableSlots() {
        System.out.println("Level: " + getFloor() + " Availibility:");
        for (Slot slot: slots) {
            System.out.println("Slot: "+ slot.getSlotNumber() + (slot.isAvailable()?" Available":" Occupied"));
        }
    }
}
