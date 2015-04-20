package com.curiel.kata.romannumbersconverter.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.curiel.kata.romannumbersconverter.project.Converter;

public class KataTesting {
	private Converter romanizer = new Converter();
	
	@Before
	public void setup(){
		romanizer = new Converter();		
	}

	@Test
	public void givenZero_ReturnEmptyString() {
		assertEquals("", romanizer.getRoman(0));		
	}
	
	@Test
	public void givenOne_Return_I(){
		assertEquals("I", romanizer.getRoman(1));
	}
	
	@Test
	public void givenFive_Return_V(){
		assertEquals("V", romanizer.getRoman(5));		
	}
	
	@Test
	public void givenTwo_ReturnII(){
		assertEquals("II", romanizer.getRoman(2));
	}
	
	@Test 
	public void givenFour_ReturnIV(){
		assertEquals("IV", romanizer.getRoman(4));
	}
	
	@Test 
	public void givenSix_ReturnVI(){
		assertEquals("VI", romanizer.getRoman(6));
	}
	
	@Test 
	public void givenTen_ReturnX(){
		assertEquals("X", romanizer.getRoman(10));
	}
	
	@Test 
	public void givenNine_ReturnIX(){
		assertEquals("IX", romanizer.getRoman(9));
	}
	
	@Test 
	public void givenNineteen_ReturnXIX(){
		assertEquals("XIX", romanizer.getRoman(19));
	}
	
	@Test 
	public void givenTwentynine_ReturnXXIX(){
		assertEquals("XXIX", romanizer.getRoman(29));
	}
	
	@Test 
	public void givenForty_ReturnXL(){
		assertEquals("XL", romanizer.getRoman(40));
	}
	
	@Test 
	public void givenFortynine_ReturnXLIX(){
		assertEquals("XLIX", romanizer.getRoman(49));
	}
	
	@Test 
	public void givenNinety_ReturnXC(){
		assertEquals("XC", romanizer.getRoman(90));
	}
	
	@Test 
	public void givenNinetynine_ReturnXCIX(){
		assertEquals("XCIX", romanizer.getRoman(99));
	}
	
	@Test 
	public void givenAhundredninety_ReturnCXC(){
		assertEquals("CXC", romanizer.getRoman(190));
	}
	
	@Test 
	public void givenFourHundred_ReturnCD(){
		assertEquals("CD", romanizer.getRoman(400));
	}
	
	@Test 
	public void givenNinehundred_ReturnCM(){
		assertEquals("CM", romanizer.getRoman(900));
	}
}
