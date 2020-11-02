package com.liblogic;

public class Client {

    private final String name;
    private final int ccNumber;
    private double ccBalance;
    private int roomNumber;

    public Client(String name, int ccNumber) {
        this.name = name;
        this.ccNumber = ccNumber;
        ccBalance = 1000.00;
    }

    public String getName() {
        return name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getCcBalance() {
        return ccBalance;
    }

    public void setCcBalance(double ccBalance) {
        this.ccBalance = ccBalance;
    }

    @Override
    public String toString() {
        return name +
                ", ccNumber=" + ccNumber +
                ", ccBalance=" + ccBalance +
                ", roomNumber=" + roomNumber +
                "\n";
    }
}
