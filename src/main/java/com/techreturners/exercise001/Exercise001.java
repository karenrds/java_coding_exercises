package com.techreturners.exercise001;

import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double cal = originalPrice + ((originalPrice * vatRate)/100);
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(cal));
    }

    public String reverse(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        return sb.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getType() == "Linux") {
                count++;
            }            
        }
        return count;
    }
}
