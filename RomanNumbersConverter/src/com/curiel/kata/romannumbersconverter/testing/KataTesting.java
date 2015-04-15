package com.curiel.kata.romannumbersconverter.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.curiel.kata.romannumbersconverter.project.Converter;

public class KataTesting {

	@Test
	public void givenZero_ReturnEmptyString() {
		Converter romanizer = new Converter();
		assertEquals("", romanizer.getRoman(0));		
	}
	
	@Test
	public void givenOne_Return_I(){
		Converter romanizer = new Converter();
		assertEquals("I", romanizer.getRoman(1));
	}

}
