package com.in.parking.ParkingBooking.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.parking.ParkingBooking.pojoclass.BookSlotParking;

@Repository
public interface BookSloatParkingDao extends JpaRepository<BookSlotParking, Long> {

}
