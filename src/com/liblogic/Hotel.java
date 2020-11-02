package com.liblogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hotel implements HotelInit {

    private static final ArrayList<Client> clients = new ArrayList<>();
    private static final Map<Integer, Room> rooms = new HashMap<>();
    private static double hotelBalance;

    public Hotel(){
        init();
    }

    public void init(){
        for(int i = 1; i <= 6; i++){
            rooms.put(100 + i, new Room(100 + i));
            rooms.put(200 + i, new EconomyRoom(200+i));
            rooms.put(300 + i, new EconomyRoom(300+i));
            rooms.put(400 + i, new EconomyRoom(400+i));
            rooms.put(500 + i, new Room(500+i));
            rooms.put(600 + i, new Room(600+i));
        }
        rooms.put(777, new Penthouse(777));
    }

    public static void checkIn(Client client, String roomType){
        int lowestAvailableRoomNumber = Integer.MAX_VALUE;

        for(Room r : rooms.values()) {
            if(r.getRoomType().equals(roomType) && r.getAvailable()) {
                if(r.getRoomNumber() < lowestAvailableRoomNumber) {
                    lowestAvailableRoomNumber = r.getRoomNumber();
                }
            }
        }
        client.setRoomNumber(lowestAvailableRoomNumber);
        client.setCcBalance(client.getCcBalance() - rooms.get(lowestAvailableRoomNumber).getPrice());
        Hotel.setHotelBalance(Hotel.getHotelBalance() + rooms.get(lowestAvailableRoomNumber).getPrice());
getRoom(client.getRoomNumber()).setOccupant(client);
        addClient(client);
        rooms.get(lowestAvailableRoomNumber).setAvailable(false);

    }

    public static void checkOut(Client client){
        getRoom(client.getRoomNumber()).setAvailable(true);

        for (Client c : clients) {
            if (client != null && c != null) {
                if (c.getName().equals(client.getName())) {
                    getRoom(client.getRoomNumber()).setOccupant(null);
                    client = null;
                    clients.remove(c);
                }
            }
        }
    }

    public static Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }

    public static void addClient(Client client) {
        clients.add(client);
    }

    public static double getHotelBalance() {
        return hotelBalance;
    }

    public static void setHotelBalance(double hotelBalance) {
        Hotel.hotelBalance = hotelBalance;
    }

    @Override
    public String toString() {
        return "Hotel{\n" +
                "clients=" + clients +
                ",\n\nhotel balance=" + hotelBalance +
                "\n\n,rooms=" +
                rooms +
                '}';
    }
}
