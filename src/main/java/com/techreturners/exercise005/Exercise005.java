package com.techreturners.exercise005;

import java.util.Locale;

public class Exercise005 {

    public boolean isPangram(String input) {
        String specialChars = "abcdefghijklmnopqrstuvwxyz";
        input = input.toLowerCase(Locale.ROOT);
        
        if (input.isEmpty()) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
			String strChar = Character.toString(input.charAt(i));
			if (specialChars.contains(strChar)) {
                specialChars = specialChars.replace(strChar, "");
			}
        }

        if (specialChars.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

}
