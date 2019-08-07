package com.in.parking.ParkingBooking.Service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.in.parking.ParkingBooking.pojoclass.Employee;
import com.in.parking.ParkingBooking.pojoclass.ParkingSloat;
@Repository
public interface ParkingsloatService {
	

	List<ParkingSloat>getParkingSlolat();
	ParkingSloat SaveParkingSloat(ParkingSloat parkingsloat);
	ParkingSloat UpadateParkingSloat(ParkingSloat parkingsloat);
	void DeleteParkingSloat(long pid);
	

}
