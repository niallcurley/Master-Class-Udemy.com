package com.company;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("Delux", "Bacon & Cheese", 10.95, "White");
        super.addHamburgerAdd1("Chips", 2.75);
        super.addHamburgerAdd2("Soft Drink", 0.75);
        super.addHamburgerAdd4("Kids Meal", 2.95);
    }

    @Override
    public void addHamburgerAdd1(String name, double price) {

        System.out.println("Cannot add additional items to delux burger");
    }

    @Override
    public void addHamburgerAdd2(String name, double price) {

        System.out.println("Cannot add additional items to delux burger");

    }

    @Override
    public void addHamburgerAdd3(String name, double price) {

        System.out.println("Cannot add additional items to delux burger");

    }

    @Override
    public void addHamburgerAdd4(String name, double price) {

        System.out.println("Cannot add additional items to delux burger");

    }
}
