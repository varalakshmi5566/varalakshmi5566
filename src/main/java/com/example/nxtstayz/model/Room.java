package com.example.nxtstayz.model;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "roomNumber")
    private String roomNumber;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private Double price;

    public Room() {
    }

    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel hotel;

    public int getRoomId() {
        return id;
    }

    public void setRoomId(int id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return type;
    }

    public void setRoomType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
