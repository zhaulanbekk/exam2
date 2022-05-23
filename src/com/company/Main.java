package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal cats = new Cat();
        Cat cat = new Cat("Tom", 3);
        System.out.println(cat);
        Animal.run();
        cat.eat();
        cat.move();
        System.out.println("______________________________________");
        Animal dogs = new Dog();
        Dog dog = new Dog("Daisy", "Black");
        System.out.println(dog);
        Animal.run();
        dog.eat();
        dog.move();

    }
}
