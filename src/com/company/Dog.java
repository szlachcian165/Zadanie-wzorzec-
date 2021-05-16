package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }

    private Dog(String name, String type, Integer age, List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    // Najprostszy mozliwy builder, tworzacy zawsze analogiczne obiekty
    public static Dog buildDog(){
        // Przygotowujemy atrybuty
        String name = "Burek";
        String type = "Owczarek";
        Integer age = 5;
        List<String> toys = new ArrayList<String>();
        toys.add("pilka");
        toys.add("kosc");

        // Buduj i zwroc obiekt Dog
        return new Dog(name, type, age, toys);
    }
}
