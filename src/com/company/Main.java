package com.company;

public class Main {

    public static void main(String[] args) {


	// write your code here
        Car civicReborn = new Car();
        civicReborn.setMileage(20.25);
        civicReborn.setDoor(5);
        civicReborn.setPrice(30000);

        Car toyotaCorolla = new Car();
        Car audi = new Car();


        System.out.println("Civic Reborn has " + civicReborn.getDoor() + " doors");
        System.out.println("Civic Reborn has " + civicReborn.getMileage() + " mileage");
        System.out.println("Civic Reborn price is " + civicReborn.getPrice() + " dollars");






    }
}
