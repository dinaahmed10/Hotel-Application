package com.hotel.spring.application.Repository;

import com.hotel.spring.application.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
