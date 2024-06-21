package com.parking.vehicle;

public abstract class Vehicle {
    private final String registrationNumber;
    private final VehicleType vehicleType;

    public Vehicle(String registrationNumber, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
}
