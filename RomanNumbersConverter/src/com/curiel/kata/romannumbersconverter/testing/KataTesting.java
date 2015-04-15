package com.curiel.kata.romannumbersconverter.testing;

import static org.junit.Assert.*;

import org.junit.Before;
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

}
