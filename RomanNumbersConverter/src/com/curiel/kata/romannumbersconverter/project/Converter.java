package com.curiel.kata.romannumbersconverter.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
	private List<Equivalence> equivalences;

	public Converter() {
		equivalences = new ArrayList<Equivalence>(Arrays.asList(
				new Equivalence(1000,"M"),
				new Equivalence(500,"D"),
				new Equivalence(100,"C"),
				new Equivalence(50,"L"),
				new Equivalence(40,"XL"),
				new Equivalence(10,"X"),
				new Equivalence(9,"IX"),
				new Equivalence(5,"V"),
				new Equivalence(4,"IV"),
				new Equivalence(1,"I")
				));
	}

	public String getRoman(int arabicNumber) {
		if (arabicNumber == 0)
			return "";
		for (Equivalence eq : equivalences)
			if(arabicNumber >= eq.getArabicNumber())
				return eq.getRomanNumber() + getRoman(arabicNumber - eq.getArabicNumber());		
		return "";
	}
}
