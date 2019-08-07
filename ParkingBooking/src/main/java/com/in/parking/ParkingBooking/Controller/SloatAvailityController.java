package com.in.parking.ParkingBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.parking.ParkingBooking.Service.SloatAvailabilyServiceImpl;
import com.in.parking.ParkingBooking.pojoclass.SloatAvailablity;

@RestController
@RequestMapping("/Sloat")
public class SloatAvailityController {
	
	@Autowired
	private SloatAvailabilyServiceImpl sloatavailityserviceimpl;
	
	@GetMapping("/getall")
	public List<SloatAvailablity> getAllSloatAvaility() {
		
		return sloatavailityserviceimpl.getAllSloatavaility();
	}
    @PostMapping("/save")
	public SloatAvailablity SaveAllSloatAvaility(SloatAvailablity sloatavaility) {
		
		return sloatavailityserviceimpl.SaveSloatavaility(sloatavaility);
	}
}
