package com.template;

public class Elevator {
    private int currentFloor;
    private final int maxFloor;
    private int passengerCount;
    private int maxPassengers;

    // Constructor
    public Elevator(int currentFloor, int maxFloor, int maxPassengers) {
        this.currentFloor = currentFloor;
        this.maxFloor = maxFloor;
        this.maxPassengers = maxPassengers;
        this.passengerCount = 0;
    }

    // Move to the requested floor
    public void moveToFloor(int requestedFloor) {
        int minFloor = 0;
        if (requestedFloor >= minFloor && requestedFloor <= maxFloor) {
            this.currentFloor = requestedFloor;
        }
    }

    // Add a passenger to the elevator
    public void addPassenger() {
        if (passengerCount < maxPassengers) {
            passengerCount++;
        }
    }

    // Remove a passenger from the elevator
    public void removePassenger() {
        if (passengerCount > 0) {
            passengerCount--;
        }
    }

    // Get the current floor of the elevator
    public int getCurrentFloor() {
        return currentFloor;
    }

    // Get the current number of passengers in the elevator
    public int getPassengerCount() {
        return passengerCount;
    }
}


