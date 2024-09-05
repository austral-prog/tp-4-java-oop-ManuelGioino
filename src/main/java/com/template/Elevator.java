package com.template;

public class Elevator {
    private int currentFloor;
    private final int maxFloor;
    private int passengerCount;
    private int maxPassengers;

    public Elevator(int currentFloor, int maxFloor, int maxPassengers) {
        this.currentFloor = currentFloor;
        this.maxFloor = maxFloor;
        this.maxPassengers = maxPassengers;
        this.passengerCount = 0;
    }

    public void moveToFloor(int requestedFloor) {
        int minFloor = 0;
        if (requestedFloor >= minFloor && requestedFloor <= maxFloor) {
            this.currentFloor = requestedFloor;
        }
    }

    public void addPassenger() {
        if (passengerCount < maxPassengers) {
            passengerCount++;
        }
    }

    public void removePassenger() {
        if (passengerCount > 0) {
            passengerCount--;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}


