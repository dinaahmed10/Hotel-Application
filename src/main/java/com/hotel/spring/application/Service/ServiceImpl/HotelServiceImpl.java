package com.hotel.spring.application.Service.ServiceImpl;

import com.hotel.spring.application.Service.HotelService;
import com.hotel.spring.application.Repository.HotelRepository;
import com.hotel.spring.application.entity.Hotel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {
     private HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel Hotel) {
        return hotelRepository.save(Hotel);
    }
}
