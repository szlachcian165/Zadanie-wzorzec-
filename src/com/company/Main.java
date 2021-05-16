package com.company;

public class Main {

    public static void main(String[] args) {

        ///////////////////ZADANIE 1.///////////////////////////
	    // Stworz 2 obiekty za pomoca buildera
        Dog dog1 = Dog.buildDog();
        Dog dog2 = Dog.buildDog();

        // Wypisz obiekty (zawartosc bedzie identyczna)
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        // Ale obiekty sa rozne (to sprawdza ten warunek)
        if(dog1 != dog2)
            System.out.println("Stworzono dwa rozne obiekty!");

        ///////////////////ZADANIE 2.///////////////////////////
        ComputerGame game1 = new ComputerGame("Doom", PegiAgeRating.P18, 51000000.0, 32, 32,32,4,3.12);
        PCGame pcGame1 = new ComputerGameToPCGameAdapter(game1);

        System.out.println(pcGame1.getTitle());
        System.out.println(pcGame1.getPegiAllowedAge());
        System.out.println(pcGame1.isTripleAGame());
        System.out.println(pcGame1.getRequirements());
    }
}
