package com.hotel.spring.application.Controller;

import com.hotel.spring.application.Service.HotelService;
import com.hotel.spring.application.entity.Hotel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/hotels")
@AllArgsConstructor
public class HotelController {
    private HotelService HotelService;

    @GetMapping("/readHotel")
    public  Hotel getHotel(){
        return new Hotel(1L,"cook","cook is available",9897865) ;
    }

    @GetMapping("/readListOfHotels")
    public ResponseEntity<List<Hotel>> readListOfHotels(){
        ArrayList<Hotel> Hotels=new ArrayList<>();
        Hotel Hotel1=new Hotel(1L,"hwqkhv","hwqkhv is available",9897865);
        Hotels.add(Hotel1);
        HotelService.createHotel(Hotel1);
        Hotel Hotel2=new Hotel(2L,"boos;l;k","boos;l;k is available",98965);
        Hotels.add(Hotel2);
        HotelService.createHotel(Hotel2);
        Hotel Hotel3=new Hotel(3L,"s;kj;","s;kj; is available",98956325);
        Hotels.add(Hotel3);
        HotelService.createHotel(Hotel3);

        return  ResponseEntity.ok(Hotels);
    }

    @GetMapping("/readHotel/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id){
        return ResponseEntity.ok( new Hotel(1L,"cook","cook is available",9897865) );
    }

    @PostMapping("/creteHotel")
    public ResponseEntity<Hotel> creteHotel(@RequestBody Hotel Hotel){
        return new ResponseEntity<>(HotelService.createHotel(Hotel), HttpStatus.CREATED);
    }
    @PutMapping("/updateHotel/{id}")
    public ResponseEntity<Hotel>  updateHotel(@PathVariable Long id,@RequestBody Hotel Hotel){
        return  ResponseEntity.ok(Hotel);
    }

    @DeleteMapping("/deleteHotel/{id}")
    public ResponseEntity<Void>  deleteHotel(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }




}
