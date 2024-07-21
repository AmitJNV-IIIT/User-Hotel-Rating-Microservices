package com.ps.hotel.services;

import com.ps.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    Hotel getHotelById(String id);

    List<Hotel> getAllHotel();
}
