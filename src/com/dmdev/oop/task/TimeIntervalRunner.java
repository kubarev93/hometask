package com.dmdev.oop.task;

public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30,2,1);
        System.out.println(timeInterval.totalSeconds());
    }
}
