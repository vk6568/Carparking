package com.in.parking.ParkingBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.parking.ParkingBooking.Service.ParkingSloatImpl;
import com.in.parking.ParkingBooking.pojoclass.ParkingSloat;


@RestController
@RequestMapping("/parking")
public class ParkingController {
	
	@Autowired
	private ParkingSloatImpl parkingsloatimpl;
	
	@GetMapping("/save")
	public  List<ParkingSloat> getallParkingSloat(){
		
		return  parkingsloatimpl.getParkingSlolat();
		
	}
	
	@PostMapping("/save")
	public ParkingSloat SaveParkingSloat(ParkingSloat parkingsloat) {
		return parkingsloatimpl.SaveParkingSloat(parkingsloat);
	}
	@PutMapping("/update")
	public ParkingSloat UpdateParkingSloat(ParkingSloat parkingsloat) {
		
		return parkingsloatimpl.UpadateParkingSloat(parkingsloat);
	}
	
	@DeleteMapping("/delete")
	public void DeleteParkingSloat(long pid) {
		 parkingsloatimpl.DeleteParkingSloat(pid);
		 
	}
	

}
