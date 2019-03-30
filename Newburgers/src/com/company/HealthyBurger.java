package com.company;

public class HealthyBurger extends Hamburger{

    private String healthyOptionName1;
    private double healthyOptionPrice1;

    private String healthyOptionName2;
    private double healthyOptionPrice2;

    public HealthyBurger(String meat, double price ) {
        super("Healthy", meat, price,"brown rye");
        this.healthyOptionName1 = healthyOptionName1;
        //super.addHamburgerAdd4("Sauce", 0.55);
    }

    public void healthyBurger1 (String name, double price){
        this.healthyOptionName1 = name;
        this.healthyOptionPrice1 = price;

    }

    public void healthyBurger2 (String name, double price){
        this.healthyOptionName2 = name;
        this.healthyOptionPrice2 = price;

    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if(this.healthyOptionName1 != null){
            hamburgerPrice += this.healthyOptionPrice1;
            System.out.println("Added " + this.healthyOptionName1 + " for an extra " + this.healthyOptionPrice1);
        }

        if(this.healthyOptionName2 != null){
            hamburgerPrice += this.healthyOptionPrice2;
            System.out.println("Added " + this.healthyOptionName2 + " for an extra " + this.healthyOptionPrice2);
        }

       return hamburgerPrice;

    }



}
