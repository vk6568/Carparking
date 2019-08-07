package com.in.parking.ParkingBooking.pojoclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name="release_availabletable")
public class SloatAvailablity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long slotid;
	private String date;
	private String availablity;
	public String getAvailablity() {
		return availablity;
	}
	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public long getSlotid() {
		return slotid;
	}
	public void setSlotid(long slotid) {
		this.slotid = slotid;
	}
	
	
	

}
