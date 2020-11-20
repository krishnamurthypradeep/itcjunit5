package com.myapp.tdd.junit5;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	
	private String id;
	
	private List<Passenger> list = new ArrayList<>();
	
	private String flightType;

	public Flight(String id, String flightType) {
		this.id = id;
		this.flightType = flightType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Passenger> getList() {
		return list;
	}

	public void setList(List<Passenger> list) {
		this.list = list;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	
	
	public boolean addPassenger(Passenger passenger) {
		switch (flightType) {
		case "Economy":
			
			return list.add(passenger);
			
		case "Business":
			if(passenger.isVip()) {
				return list.add(passenger);
			}

		default:
			throw new RuntimeException("Unknown Type "+flightType);
		}
	}
	
	
	public boolean removePassenger(Passenger passenger) {
		switch (flightType) {
		case "Economy":
			if(passenger.isVip()) {
				return list.remove(passenger);
			}
			
			
		case "Business":
			return false;

		default:
			throw new RuntimeException("Unknown Type "+flightType);
		}
	}
	

}
