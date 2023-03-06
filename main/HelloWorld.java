package main;

import animals.Animal;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Hello new user!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an animal name");

        Animal animal = new Animal();
        animal.setName(sc.nextLine());

        System.out.println("Have you ever seen a " + animal.getName() + "?");

    }
}
