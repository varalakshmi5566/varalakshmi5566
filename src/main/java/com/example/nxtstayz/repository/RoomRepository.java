package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RoomRepository {

    ArrayList<Room> getRooms();

    Room getRoomById(Integer roomId);

    Room addRoom(Room room);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

    Hotel getHotel(int roomId);
}