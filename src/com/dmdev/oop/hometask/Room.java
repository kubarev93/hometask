package com.dmdev.oop.hometask;

public class Room {
    private boolean walkenRoom;

    Room(boolean walkenRoom) {
        this.walkenRoom = walkenRoom;
    }

    public void print() {
        System.out.println("Room is walken: " + walkenRoom);
    }

}
