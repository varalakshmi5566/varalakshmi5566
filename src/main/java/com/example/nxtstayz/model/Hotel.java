
package com.example.nxtstayz.model;

import javax.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hotelName")
    private String hotelName;

    @Column(name = "location")
    private String location;

    @Column(name = "rating")
    private int rating;

    private String hotelName2;

    public Hotel() {
    }

    public int getHotelId() {
        return id;
    }

    public void setHotelId(int id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String name) {
        hotelName2 = hotelName;
        this.hotelName = hotelName2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;

    }
}