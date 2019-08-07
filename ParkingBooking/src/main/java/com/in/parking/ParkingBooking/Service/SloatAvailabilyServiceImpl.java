package com.in.parking.ParkingBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.parking.ParkingBooking.Dao.SloatAvailityDao;
import com.in.parking.ParkingBooking.pojoclass.SloatAvailablity;

@Service
public class SloatAvailabilyServiceImpl implements SloatAvailityService {
	
	@Autowired
	private SloatAvailityDao sloatavailitydao;

	@Override
	public List<SloatAvailablity> getAllSloatavaility() {
		// TODO Auto-generated method stub
		return sloatavailitydao.findAll();
	}

	@Override
	public SloatAvailablity SaveSloatavaility(SloatAvailablity sloatavaility) {
		// TODO Auto-generated method stub
		return  sloatavailitydao.save(sloatavaility);
	}

}
