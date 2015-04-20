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
	}

	public String getRoman(int arabicNumber) {
		if (arabicNumber == 0)
			return "";
		for (Map.Entry equivalence : equivalences.entrySet())
			if (arabicNumber >= (Integer) equivalence.getKey())
				return (String) equivalence.getValue()
						+ getRoman(arabicNumber
								- (Integer) equivalence.getKey());
		return "";
	}

}
