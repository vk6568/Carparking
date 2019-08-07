package com.in.parking.ParkingBooking.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.parking.ParkingBooking.Dao.BookSloatParkingDao;
import com.in.parking.ParkingBooking.Dao.ParkingSloatRepository;
import com.in.parking.ParkingBooking.Dao.SloatAvailityDao;
import com.in.parking.ParkingBooking.pojoclass.BookSlotParking;
import com.in.parking.ParkingBooking.pojoclass.ParkingSloat;
import com.in.parking.ParkingBooking.pojoclass.SloatAvailablity;


@Service
public class BookSloatParkingServiceImpl implements BookSloatParkingService {
	
	@Autowired
	private BookSloatParkingDao booksloatparkingdao;
	@Autowired
	private SloatAvailityDao sloatavaility;

	@Override
	public BookSlotParking BookSloatSpace(long eid,long slotid) {
		
//		Optional<SloatAvailablity> s1= sloatavaility.findById(slotid);
//		if(s1.get().equals("available")) {
//			s1.Se
//		}
		// TODO Auto-generated method stub
		return null;
	}

}
