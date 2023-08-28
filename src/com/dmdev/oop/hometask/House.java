package com.dmdev.oop.hometask;

public class House {
    private int number;
    private Floor[] floors;
    House(int number, Floor[] floor) {
        this.number = number;
        this.floors = floor;
    }
    public void print() {
        System.out.println("House number: " + number + ", count floors: " + floors.length);
        for (var floor: floors) {
            floor.print();
        }
    }
}
