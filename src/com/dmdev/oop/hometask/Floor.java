package com.dmdev.oop.hometask;

public class Floor {

    private int numberFloor;
    private Flat[] flats;

    Floor(int numberFloor, Flat[] flats) {
        this.numberFloor = numberFloor;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Number floor: " + numberFloor + ", count flats: " + flats.length);
        for (var floor : flats) {
            floor.print();
        }
    }
}
