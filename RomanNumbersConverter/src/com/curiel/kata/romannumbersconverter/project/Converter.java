package com.curiel.kata.romannumbersconverter.project;

public class Converter {

	public String getRoman(int arabicNumber) {		
		switch (arabicNumber) {
		case 0:
			return "";			
		case 1:
			return "I";
		case 5:
			return "V";		
		default:
			break;
		}
		return "";
	}

}
