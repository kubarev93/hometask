package com.dmdev.oop.lesson2;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1001);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }
}
