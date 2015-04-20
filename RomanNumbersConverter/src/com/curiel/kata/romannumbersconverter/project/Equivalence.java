package com.curiel.kata.romannumbersconverter.project;

public class Equivalence {
	private Integer arabicNumber;
	private String romanNumber;
	
	public Equivalence(final Integer arabic, final String roman) {
		arabicNumber = arabic;
		romanNumber = roman;
	}
	
	public Integer getArabicNumber() {
		return arabicNumber;
	}
	public void setArabicNumber(Integer arabicNumber) {
		this.arabicNumber = arabicNumber;
	}
	public String getRomanNumber() {
		return romanNumber;
	}
	public void setRomanNumber(String romanNumber) {
		this.romanNumber = romanNumber;
	}
}
