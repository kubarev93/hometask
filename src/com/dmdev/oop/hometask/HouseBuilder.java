package com.dmdev.oop.hometask;

public class HouseBuilder {

    public static void main(String[] args) {
        Room room = new Room(true);
        Flat flat = new Flat(5, new Room[]{room});
        Floor floor = new Floor(20, new Flat[]{flat});
        Floor floor1 = new Floor(10, new Flat[]{flat});
        House house = new House(2, new Floor[]{floor, floor1});
        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.print();
    }
}


