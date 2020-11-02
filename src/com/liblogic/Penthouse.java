package com.liblogic;

public class Penthouse extends Room{

    public Penthouse(int roomNumber){
        super(roomNumber);
        setPrice(400.00);
        setBedCount(1);
        setRoomType("Penthouse");
    }

}
