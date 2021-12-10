package com.techreturners.exercise005;

import java.util.Locale;

public class Exercise005 {

    public boolean isPangram(String input) {
        String alphabetChars = "abcdefghijklmnopqrstuvwxyz";
        input = input.toLowerCase(Locale.ROOT);
        
        if (input.isEmpty()) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
			String strChar = Character.toString(input.charAt(i));
			if (alphabetChars.contains(strChar)) {
                alphabetChars = alphabetChars.replace(strChar, "");
			}
        }

        if (alphabetChars.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

}
