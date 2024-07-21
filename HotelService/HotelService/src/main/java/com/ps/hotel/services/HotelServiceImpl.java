package com.ps.hotel.services;

import com.ps.hotel.entities.Hotel;
import com.ps.hotel.exception.ResourceNotFoundException;
import com.ps.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return this.hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelById(String id) {
        return this.hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("This hotel is not found with the given id "+id));
    }

    @Override
    public List<Hotel> getAllHotel() {
        return this.hotelRepository.findAll();
    }
}
