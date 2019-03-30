package com.company;

public class Main {

    public static void main(String[] args) {
     Hamburger hamburger = new Hamburger("Basic","Sausage", 3.68, "White");

     //double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAdd1("Lettuce", 0.32);
        hamburger.addHamburgerAdd2("Tomato", 0.22);
        hamburger.addHamburgerAdd3("Onions", 0.12);
        //price = hamburger.itemizeHamburger();
        System.out.println("Total price of burger with additions £"+ hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6.52);
        healthyBurger.healthyBurger1("Tomato", 0.75);
        healthyBurger.healthyBurger2("Cheese", 0.65);
        System.out.println("Total price of health burger with extras £" + healthyBurger.itemizeHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        //deluxBurger.itemizeHamburger();
        System.out.println("Total price of delux burger plus extras £" + deluxBurger.itemizeHamburger());






    }
}
