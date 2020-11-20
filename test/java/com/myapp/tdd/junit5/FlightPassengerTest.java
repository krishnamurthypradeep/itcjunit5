package com.myapp.tdd.junit5;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightPassengerTest {
	
	@Test
	public void testFlights() {
		
		Flight economyFlight = new Flight("1", "Economy");
		
		Flight businessFlight = new Flight("2", "Business");
		
		Passenger ram = new Passenger("Ram", true);
		
		Passenger sham = new Passenger("Sham", false);
		
		assertEquals(true,economyFlight.addPassenger(ram));
		assertEquals(false,economyFlight.removePassenger(ram));
		
		assertEquals(true,businessFlight.addPassenger(ram));
		assertEquals(false,businessFlight.removePassenger(ram));
		
		assertEquals(true,economyFlight.addPassenger(sham));
		assertEquals(true,economyFlight.removePassenger(sham));
		
		assertEquals(false,businessFlight.addPassenger(sham));
		assertEquals(false,businessFlight.removePassenger(sham));
		
	}

}
