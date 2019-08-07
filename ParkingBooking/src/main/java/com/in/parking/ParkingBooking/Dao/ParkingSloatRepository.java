package com.in.parking.ParkingBooking.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.parking.ParkingBooking.pojoclass.ParkingSloat;

@Repository
public interface ParkingSloatRepository extends JpaRepository<ParkingSloat, Long> {

}
