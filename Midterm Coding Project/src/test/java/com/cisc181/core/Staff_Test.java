package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	private ArrayList<Staff> stafftest = new ArrayList<Staff>();

	stafftest.add("John", "Nick", "Doe", "03/23/1967", "14 Evans st.", "(234)-456-4356", "efifie@test.edu", "M-W-F 9:00-10:00", 6, 4300, "03/12/1989" );
	
	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
