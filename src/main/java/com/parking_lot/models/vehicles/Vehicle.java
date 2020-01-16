package com.parking_lot.models.vehicles;

public abstract class Vehicle {
    private String licenseNumber;
    private VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }
}
