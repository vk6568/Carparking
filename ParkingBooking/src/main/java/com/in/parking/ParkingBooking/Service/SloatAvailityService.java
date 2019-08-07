package com.in.parking.ParkingBooking.Service;

import java.util.List;

import com.in.parking.ParkingBooking.pojoclass.SloatAvailablity;



public interface SloatAvailityService {
	
	List<SloatAvailablity> getAllSloatavaility();
	SloatAvailablity  SaveSloatavaility(SloatAvailablity sloatavaility);

}
