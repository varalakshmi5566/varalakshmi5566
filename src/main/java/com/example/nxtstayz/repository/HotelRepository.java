package com.example.nxtstayz.repository;

import java.util.*;

import com.example.nxtstayz.model.*;

public interface HotelRepository {
    ArrayList<Hotel> getHotels();

    Hotel getHotelById(int hotelId);

    Hotel addHotel(Hotel hotel);

    Hotel updateHotel(int bookId, Hotel hotel);

    void deleteHotel(int hotelId);

    List<Room> getHotelRoom(int HotelId);

}