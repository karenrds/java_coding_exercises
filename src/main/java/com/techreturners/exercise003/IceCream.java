package com.techreturners.exercise003;

public class IceCream {
    private int iceCreamCode;
    private String iceCreamFlavour;

    public IceCream(int iceCreamCode, String iceCreamFlavour) {
        this.iceCreamCode = iceCreamCode;
        this.iceCreamFlavour = iceCreamFlavour;
    }   
    
    public int getIceCreamCode() {
        return iceCreamCode;
    }
    
    public String getIceCreamFlavour() {
        return iceCreamFlavour;
    }
}
