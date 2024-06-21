package com.parking;

import com.parking.vehicle.Vehicle;
import com.parking.vehicle.VehicleType;

public class Slot {
    private Vehicle parkedVehicle;
    private final VehicleType vehicleType;
    private final int slotNumber;

    public Slot(int slotNumber) {
        this.slotNumber = slotNumber;
        //default setting
        this.vehicleType = VehicleType.CAR;
    }

    public int getSlotNumber() {
        return this.slotNumber;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public Vehicle getParkedVehicle() {
        return this.parkedVehicle;
    }

    public boolean isAvailable() {
        return this.parkedVehicle == null;
    }
    public void park(Vehicle vehicle) {
        if (isAvailable() && vehicle.getVehicleType() == this.vehicleType) {
            this.parkedVehicle = vehicle;
        } else {
            throw new IllegalArgumentException("Invalid vehicle type or spot already occupied");
        }

    }
    public void unpark() {
        this.parkedVehicle = null;
    }
}
