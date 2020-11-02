package com.liblogic;

public class Room {

    private double price;
    private int bedCount;
    private String roomType;
    private final int roomNumber;
    private Client occupant;
    private boolean isAvailable = true;


    public Room(int roomNumber){
        this.roomNumber = roomNumber;
        setRoomType("Standard");
        setPrice(130.00);
        setBedCount(2);
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public int getBedCount() {
//        return bedCount;
//    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

//    public Client getOccupant(int roomNumber) {
//        return occupant;
//    }

    public void setOccupant(Client occupant2) {
        occupant = occupant2;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "price=" + price +
                ", bedCount=" + bedCount +
                ", roomType='" + roomType + '\'' +
                ", roomNumber=" + roomNumber +
                ",\n\t\t occupant=" + occupant +
                ", isAvailable=" + isAvailable +
                "}\n\n";
    }
}
