package com.liblogic;

public class Main {

    public static void main(String[] args) {

        Hotel marriott = new Hotel();

        Client tom = new Client("Tom Hodgkinson", 12345);
        Hotel.checkIn(tom, "Penthouse");

        Client arthur = new Client("Arthur G", 54321);
        Hotel.checkIn(arthur, "Standard");

        //Hotel state with tom and arthur checked in
        System.out.println("\n" + marriott);

        Hotel.checkOut(tom);
        //Hotel state after tom checked out
        System.out.println("\n" + marriott);
    }
}
