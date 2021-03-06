package com.company;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return  "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_UP);
        return nf.format(price);

    }

    @Override
    public boolean equals(Object obj){
        //this equals method is case-sensitive
        if(obj == null){
            return false;
        }

        if(obj instanceof Product){
            Product product = (Product)obj;
            if(product.getCode().length()!= this.getCode().length()
                    &&product.getDescription().length()!= this.getDescription().length()&&
                    product.getPrice()==this.getPrice()){
                return false;
            }

            for (int i=0; i<product.getCode().length();i++){
                if(product.getCode().charAt(i)!=this.getCode().charAt(i)){
                    return false;
                }
            }
        }
        //if this statement is reached then the objects are equal
        return  true;
    }


    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
