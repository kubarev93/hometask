package com.dmdev.oop.hometask;

public class Flat {

    private int numberFlat;
    private Room[] rooms;

    Flat(int numberFlat, Room[] rooms) {
        this.numberFlat = numberFlat;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Number flat: " + numberFlat + ", total rooms: " + rooms.length);
        for (var floor : rooms) {
            floor.print();
        }
    }
}
