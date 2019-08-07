package com.in.parking.ParkingBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.parking.ParkingBooking.Dao.ParkingSloatRepository;
import com.in.parking.ParkingBooking.pojoclass.ParkingSloat;

@Service
public class ParkingSloatImpl implements ParkingsloatService {
	
	@Autowired
	private ParkingSloatRepository parkingsloatrepository;

	@Override
	public List<ParkingSloat> getParkingSlolat() {
		// TODO Auto-generated method stub
		return parkingsloatrepository.findAll();
	}

	@Override
	public ParkingSloat SaveParkingSloat(ParkingSloat parkingsloat) {
		// TODO Auto-generated method stub
		return parkingsloatrepository.save(parkingsloat);
	}

	@Override
	public ParkingSloat UpadateParkingSloat(ParkingSloat parkingsloat) {
		// TODO Auto-generated method stub
		return parkingsloatrepository.saveAndFlush(parkingsloat);
	}

	@Override
	public void DeleteParkingSloat(long pid) {
		// TODO Auto-generated method stub
		parkingsloatrepository.deleteById(pid);
	}
	

}
