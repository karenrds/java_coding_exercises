package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.List;

public class Exercise003 {
    List<IceCream> icecreams = new ArrayList<IceCream>();

    public Exercise003(){
        IceCream ic1 = new IceCream(0, "Pistachio");
        IceCream ic2 = new IceCream(1, "Raspberry Ripple");
        IceCream ic3 = new IceCream(2, "Vanilla");
        IceCream ic4 = new IceCream(3, "Mint Chocolate Chip");
        IceCream ic5 = new IceCream(4, "Chocolate");
        IceCream ic6 = new IceCream(5, "Mango Sorbet");

        icecreams.add(ic1);
        icecreams.add(ic2);
        icecreams.add(ic3);
        icecreams.add(ic4);
        icecreams.add(ic5);
        icecreams.add(ic6);
    }
    int getIceCreamCode(String iceCreamFlavour) {
        IceCream iceCream = icecreams.stream().filter(x -> iceCreamFlavour.equals(x.getIceCreamFlavour())).findFirst().orElse(null);
        return iceCream.getIceCreamCode();
    }

    String[] iceCreamFlavours() {
        List<String> flavours = new ArrayList<String>();
        String name = "";
        for (int i = 0; i < icecreams.size(); i++) {
            name = icecreams.get(i).getIceCreamFlavour();
            flavours.add(name);
        }     
        String[] simpleArray = new String[ flavours.size() ];
        return flavours.toArray(simpleArray);
    }

}
