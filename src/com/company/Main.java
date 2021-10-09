package com.company;

public class Main {

    public static void main(String[] args) {


        Pet pet = new Pet("Азалия");
        Ovcharka ovcharka = new Ovcharka(11);
        Ovcharka ovcharka2 = new Ovcharka(121);
        Animal animal = new Animal() {




        };

        System.out.println(ovcharka.getInfo());
        System.out.println("Порода: " +pet.getBreed());

    }
}
