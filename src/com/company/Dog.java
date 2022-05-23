package com.company;

public class Dog extends Animal implements Movable {
    private String color;

    public Dog() {

    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    void eat() {
        System.out.println("Dog eats beef and meats");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }

    @Override
    public String toString() {
        return super.toString() +
                " color='" + color + '\'';
    }
}
