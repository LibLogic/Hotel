package com.liblogic;

public class EconomyRoom extends Room{

    public EconomyRoom(int roomNumber){
        super(roomNumber);
        setPrice(85.00);
        setBedCount(1);
        setRoomType("Economy");
    }
}
