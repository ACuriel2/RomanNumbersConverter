package com.curiel.kata.romannumbersconverter.project;

import java.util.Hashtable;
import java.util.Map;

public class Converter {
	private Hashtable<Integer, String> equivalences;

	public Converter() {
		equivalences = new Hashtable<Integer, String>();
		equivalences.put(1, "I");
		equivalences.put(4, "IV");
		equivalences.put(5, "V");		
		equivalences.put(10, "X");
		
	}

	public String getRoman(int arabicNumber) {
		if (arabicNumber == 0)
			return "";
		for (Map.Entry equivalence : equivalences.entrySet())
			if (arabicNumber >= arabicNumber(equivalence))
				return romanNumber(equivalence)
						+ getRoman(arabicNumber
								- arabicNumber(equivalence));
		return "";
	}

	private String romanNumber(Map.Entry equivalence) {
		return (String) equivalence.getValue();
	}

	private Integer arabicNumber(Map.Entry equivalence) {
		return (Integer) equivalence.getKey();
	}

}
