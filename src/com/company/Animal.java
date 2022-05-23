package com.company;

public abstract class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    static void run() {
        System.out.println("Animals can run");
    }


    @Override
    public String toString() {
        return "\t\t\tAnimal\n" +
                " name='" + name + '\'';
    }
}
