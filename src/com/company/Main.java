package com.company;

public class Main {

    public static void main(String[] args) {
	    // Stworz 2 obiekty za pomoca buildera
        Dog dog1 = Dog.buildDog();
        Dog dog2 = Dog.buildDog();

        // Wypisz obiekty (zawartosc bedzie identyczna)
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        // Ale obiekty sa rozne (to sprawdza ten warunek)
        if(dog1 != dog2)
            System.out.println("Stworzono dwa rozne obiekty!");
    }
}
